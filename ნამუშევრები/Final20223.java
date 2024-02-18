import java.util.ArrayList;

import acm.program.ConsoleProgram;

public class Final20223 extends ConsoleProgram{
public void run(){
	ArrayList<Integer> list = new ArrayList<>();
	list.add(4);
	list.add(1);
	list.add(3);
	list.add(2);
	println(kindaSorted(list));
}

private Boolean kindaSorted(ArrayList<Integer> list) {
	for(int i = 0; i < list.size(); i ++){
		for(int k = i +1; k < list.size(); k ++){
			ArrayList<Integer> secondList = swap(list, i, k);
			ArrayList<Integer> thirdList = turnAround(secondList);
			if(thirdList != null){
				return true;
			}
		}
	}
	return false;
}

private ArrayList<Integer> turnAround(ArrayList<Integer> secondList) {
	ArrayList<Integer> temp = secondList;
	for(int i = 0; i < temp.size() -1; i ++){
		for(int k = i+1; k < temp.size(); k++){
			int length = k - i -1;
			for(int n = 0; n < length; n ++){
				int temporary = temp.get(i + n);
				temp.set(i + n, temp.get(k - n));
				temp.set(k, temporary);
			}
			if(isSorted(temp)){
				return temp;
			}
		}
	}
	return null;
}

private boolean isSorted(ArrayList<Integer> temp) {
	for(int k = 0; k < temp.size()-1; k ++){
		if(!(temp.get(k)<= temp.get(k+1))){
			return false;
		}
	}
	return true;
}

private ArrayList<Integer> swap(ArrayList<Integer> list, int i, int k) {
	ArrayList<Integer> temp = list;
	int temporary = (int) temp.get(i);
	temp.set(i, temp.get(k));
	temp.set(k, temporary);
	return temp;
}
}
