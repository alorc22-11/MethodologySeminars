import java.util.ArrayList;
import java.util.HashMap;

import acm.program.ConsoleProgram;

public class Final2014second3 extends ConsoleProgram{

private ArrayList<String> findCousins(ArrayList<String> all) {
	String name = "panteleimoni";
	HashMap<String, ArrayList<String>> natesaoba = new HashMap<>(); 
	for(int i = 0; i < all.size(); i ++){
		String[] couple = all.get(i).split(" ");
		String father = couple[0];
		String son = couple[1];
		if(natesaoba.containsKey(father)){
			natesaoba.get(father).add(son);
		}else{
			ArrayList<String> bavshvebi = new ArrayList<>();
			bavshvebi.add(son);
			natesaoba.put(father, bavshvebi);
		}
		
	}
	ArrayList<ArrayList<ArrayList<String>>> vapsheYvelaBidzaShvili = new ArrayList<>();
	
	for(String babua : natesaoba.keySet()){
		ArrayList<String> mamebi = natesaoba.get(babua);
		ArrayList<ArrayList<String>> dzmebisShvilebi = new ArrayList<>();
		for(int i = 0; i < mamebi.size(); i ++){
			String mama = mamebi.get(i);
			ArrayList<String> yvelaShvili = new ArrayList<>();
			if(natesaoba.containsKey(mama)){
				ArrayList<String> bavshvebi = natesaoba.get(mama);
				for(int k = 0; k < bavshvebi.size(); k ++){
					yvelaShvili.add(bavshvebi.get(k));
				}
			}else{
				break;
			}
			dzmebisShvilebi.add(yvelaShvili);
		}
		vapsheYvelaBidzaShvili.add(dzmebisShvilebi);
		
	}
	ArrayList<String> cousinebi = new ArrayList<>();
	for(int i = 0 ; i < vapsheYvelaBidzaShvili.size(); i ++){
		ArrayList<ArrayList<String>> dzmebi = vapsheYvelaBidzaShvili.get(i);
		
		for(int k = 0; k < dzmebi.size(); k ++){
			if(dzmebi.get(k).contains(name)){
				for(int  j = 0; j < dzmebi.size(); j ++){
					if(j != k){
						int size = dzmebi.get(j).size();
						for(int s = 0; s < size; s ++){
							cousinebi.add(dzmebi.get(j).get(s));
						}
					}
				}
			}
		}
	}

	return cousinebi;
}
public void run(){
	ArrayList<String> all = new ArrayList<>();
	String one = "nika giorgi";
	String two = "solomoni nika";
	String three = "solomoni sandro";
	String four = "giorgi dachi";
	String five = "sandro ivane";
	String six = "nika abeli";
	String seven = "abeli panteleimoni";
	all.add(one);
	all.add(two);
	all.add(three);
	all.add(four);
	all.add(five);
	all.add(six);
	all.add(seven);
	println(findCousins(all).toString());
	
}

}
