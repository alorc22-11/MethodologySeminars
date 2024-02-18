import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;

import com.sun.corba.se.spi.orbutil.fsm.Guard.Result;

import acm.program.ConsoleProgram;

public class Final2020third1 extends ConsoleProgram{
public void run(){

}
private Iterator<String> it(String fileName){
	ArrayList<String> wordList = readWords(fileName);
	ArrayList<String> results = new ArrayList<>();
	for( String word : wordList){
		if(unStable(word)){
			
		}
	}
	return null;
	
}
private boolean unStable(String word) {
	for(int i = 1; i  < word.length() - 3; i ++ ){
		String part1 = word.substring(0,i);
		String rest = word.substring(i);
		for(int k = 1; k < rest.length()-2; k ++){
			String part2 = rest.substring(0,k);
			String part3 = rest.substring(k);
			if(isAsc(part1) && isDesc(part2) && isAsc(part3)){
				return true;
			}
		}
	}
	return false;
}
private boolean isDesc(String text) {
	if(text.length() == 1){
		return true;
	}
	for(int i = 1; i < text.length(); i ++){
		char prev = text.charAt(i-1);
		char now = text.charAt(i);
		if(prev<=now){
			return false;
		}
	}
	return false;
}
private boolean isAsc(String text) {
	if(text.length() == 1){
		return true;
	}
	for(int i = 1; i < text.length(); i ++){
		char prev = text.charAt(i-1);
		char now = text.charAt(i);
		if(prev>=now){
			return false;
		}
	}
	return false;
}
private ArrayList<String> readWords(String fileName) {
	ArrayList<String> temp = new ArrayList<>();
	try{
		BufferedReader rd = new BufferedReader(new FileReader(fileName));
		while(true){
			String line = rd.readLine();
			if(line== null){
				break;
			}
			String[] words = line.split(" ");
			for(int  i =0 ; i < words.length; i ++){
				temp.add(words[i]);
			}
		}
		rd.close();
	}catch(Exception e){
		
	}
	return temp;
}
} 