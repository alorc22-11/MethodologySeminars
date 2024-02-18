import java.util.ArrayList;

import acm.program.ConsoleProgram;

public class Final20193 extends ConsoleProgram {
public void run(){
	String one = "abcdab";
	String two = "acbcdafb";
	println(substring(one, two));
}

private String substring(String one, String two) {
	ArrayList<String> arr = makeArray(one);
	ArrayList<String> list = makeArray(two);
	ArrayList<String> similars = fillArray(arr, list);
	String max = findMax(similars);
	return max;
}

private String findMax(ArrayList<String> similars) {
	int max = 0;
	String maxStr = "";
	for(int i = 0; i<similars.size(); i ++){
		if(similars.get(i).length()>max){
			maxStr = similars.get(i);
			max = maxStr.length();
		}
	}
	return maxStr;
}

private ArrayList<String> fillArray(ArrayList<String> arr, ArrayList<String> list) {
	ArrayList<String> temp = new ArrayList<>();
	for(int i = 0; i < arr.size(); i ++){
		for(int j = 0; j < list.size(); j ++){
			if(arr.get(i).equals(list.get(j))){
				temp.add(arr.get(i));
			}
		}
	}
	return temp;
}

private ArrayList<String> makeArray(String str) {
	ArrayList<String> temp = new ArrayList<>();
	for(int i = 0; i < str.length(); i ++){
		String temporary = "";
		for(int j =i +1; j < str.length(); j ++){
			if(str.charAt(j-1) < str.charAt(j) ){
				if(j-1 == i){
					temporary += str.charAt(j-1);
				}
				temporary +=str.charAt(j);
				temp.add(temporary);
			}
		}
	}
	return temp;
}
}
