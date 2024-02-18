import java.util.ArrayList;
import java.util.HashMap;

import acm.program.ConsoleProgram;

public class Final2019second4 extends ConsoleProgram{
	public void run(){
		HashMap<String, Integer> hm1 = new HashMap<>();
		HashMap<String, Integer> hm2 = new HashMap<>();
		hm1.put("lizi", 10);
		hm1.put("nana", 20);
		hm1.put("mea", 5);
		hm2.put("lizi", 15);
		hm2.put("mea", 15);
		println(merge(hm1, hm2));
	}

	private String merge(HashMap<String, Integer> hm1, HashMap<String, Integer> hm2) {
		HashMap<String, ArrayList<Integer>> newMap = new HashMap<>();
		HashMap<String, Integer> more = hm1;
		HashMap<String, Integer> less = hm2;
		if(hm2.size() > hm1.size()){
			more = hm2;
			less = hm1;
		}
		for(String a : more.keySet()){
			ArrayList<Integer> grades = new ArrayList<>();
			if(less.containsKey(a)){
				grades.add(less.get(a));
			}
			grades.add(more.get(a));
			newMap.put(a, grades);
		}
		return newMap.toString();
	}
}
