import java.util.ArrayList;

import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

public class Final2014second4 extends ConsoleProgram{
	private RandomGenerator rgen = RandomGenerator.getInstance();
public void run(){
	int n = 1000;
	println(simulate(n));
	
}

private double simulate(int n){
int count = 0;
	
	for(int i = 0; i < n; i ++){
		ArrayList<Boolean> cards = new ArrayList<>();
		for(int  j = 0; j < 2; j ++){
			cards.add(true);
		}
		for(int j = 0; j < 34; j ++){
			cards.add(false);
		}
		int jokersCount = 0;
		for(int k = 0 ; k < 9 ; k ++){
			int index = rgen.nextInt(0,cards.size()-1);
			if(cards.get(index)){
				jokersCount++;
			}
			cards.remove(index);
			int secInd = rgen.nextInt(0,cards.size()-1);
			cards.remove(secInd);
			int thiInd = rgen.nextInt(0,cards.size()-1);
			cards.remove(thiInd);
			int fourInd = rgen.nextInt(0,cards.size()-1);
			cards.remove(fourInd);
		}
		if(jokersCount == 2){
			count ++;
		}
	}
	return (double) count /n;
}



}
