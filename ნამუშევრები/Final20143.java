import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

import acm.program.ConsoleProgram;

public class Final20143 extends ConsoleProgram{
public void run(){
	ArrayList<String> list = new ArrayList<>();
	list.add("lizi lorcho");
	list.add("lizi dito");
	list.add("dito sandro");
//	list.add("sandro nacho");
//	list.add("dito solomon");
	println(isThatTrue(list));
}

private Boolean isThatTrue(ArrayList<String> list) {
	HashMap<String, ArrayList<String>> hm = makeMap(list);
	for(String a : hm.keySet()){
		ArrayList<String> thisList = hm.get(a);
		for(String k : hm.keySet()){
			if(!thisList.contains(k)){
				ArrayList<String> otherList = hm.get(k);
				for(String j : hm.keySet()){
					if(!thisList.contains(j) && !otherList.contains(j)){
						return false;
					}
				}
			}
		}
	}
	return true;
	
}

private HashMap<String, ArrayList<String>> makeMap(ArrayList<String> list) {
	HashMap<String, ArrayList<String>> temp = new HashMap<>();
	for(int i = 0; i < list.size(); i ++){
		String iuri = list.get(i);
		StringTokenizer tok = new StringTokenizer(iuri);
		String friend1 = "";
		String friend2 = "";
		int n = 0;
		while(tok.hasMoreTokens()){
			if(n==0){
				friend1 = tok.nextToken();
				n++;
			}else{
				friend2 = tok.nextToken();
			}
		}
		fillMap(friend1, friend2, temp);
	}
	return temp;
}

private void fillMap(String friend1, String friend2, HashMap<String, ArrayList<String>> temp) {
	if(temp.containsKey(friend1)){
		temp.get(friend1).add(friend2);
	}else{
		ArrayList<String> arr = new ArrayList<>();
		arr.add(friend1);
		arr.add(friend2);
		temp.put(friend1, arr);
	}
	if(temp.containsKey(friend2)){
		temp.get(friend2).add(friend1);
		
	}else{
		ArrayList<String> listo = new ArrayList<>();
		listo.add(friend2);
		listo.add(friend1);
		temp.put(friend2, listo);
	}
}
}
