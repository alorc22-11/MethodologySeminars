import java.util.ArrayList;

import acm.program.ConsoleProgram;

public class Final2022second3 extends ConsoleProgram {
	public void run(){
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		ArrayList<Integer> list2 = new ArrayList<>();
		list2.add(1);
		list2.add(0);
		list2.add(0);
		list2.add(0);
		println(gamravleba(list1, list2).toString());
	}

	private ArrayList<Integer> gamravleba(ArrayList<Integer> list1, ArrayList<Integer> list2) {
		ArrayList<Integer> result = new ArrayList<>();
		ArrayList<Integer> shorter = list1;
		ArrayList<Integer> longer = list2;
		if(list1.size() > list2.size()){
			shorter = list2;
			longer = list1;
		}
		int vimaxsovrebt = 0;
		for(int i = longer.size()-1; i >= 0; i --){
			for(int j = shorter.size()-1; j >= 0; j --){
				int lastNum = longer.get(i) * shorter.get(j);
				if(lastNum>= 10){
					String numString = Integer.toString(lastNum);
					vimaxsovrebt = Integer.parseInt(numString.charAt(0)+"");
					lastNum = Integer.parseInt(numString.charAt(1) + "");
				}
			}
		}
		return null;
	}
}
