import java.util.ArrayList;

import acm.program.ConsoleProgram;

public class Final2018second2 extends ConsoleProgram{
public void run(){
	String str = "abab";
	println(howMany(str));
}

private int howMany(String str) {
	ArrayList<String> myList = new ArrayList<>();
	for(int i = 0; i < str.length(); i ++){
		String temporary = str.charAt(i)+"";
		for(int k = i + 1; k < str.length(); k ++){
			temporary += str.charAt(k);
			myList.add(temporary);
			
		}
	}
	int number = findAll(myList);
	return number;
}

private int findAll(ArrayList<String> myList) {

	ArrayList<String> newList = new ArrayList<>();
	for(int i = 0 ; i< myList.size(); i ++){
		String sub = myList.get(i);
		if(isEqual(sub) &&!newList.contains(sub)){
			newList.add(sub);
		}
	}
	return newList.size();
}


private boolean isEqual(String sub) {
	int countA = 0;
	int countB = 0;
	for(int i = 0; i < sub.length(); i ++){
		if((sub.charAt(i)+"").equals("a")){
			countA++;
		}else{
			countB ++;
		}
	}
	if(countA == countB){
		return true;
	}
	return false;
}
}
