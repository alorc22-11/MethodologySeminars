import java.util.ArrayList;

import acm.util.RandomGenerator;

public class Final20144 {
private RandomGenerator rgen = RandomGenerator.getInstance();

private double simulate(int n){
	int nGood = 0;
	for(int i = 0 ; i < n; i ++){
		if(simulateOne()){
			nGood++;
		}
	}
	return (double) nGood/n;
		
}

private boolean simulateOne() {
	ArrayList<Boolean> dominos = new ArrayList<>();
	for(int i = 0; i < 7; i ++){
		dominos.add(true);
	}
	for(int i = 0; i< 21; i ++){
		dominos.add(false);
	}
	int firstCyvilebi = 0;
	for(int i = 0 ;i< 7; i ++){
		int each = rgen.nextInt(0,dominos.size()-1);
		if(dominos.get(each)){
			firstCyvilebi ++;
		}
		dominos.remove(each);
		int secondEach = rgen.nextInt(0, dominos.size()-1);
		dominos.remove(secondEach);
	}
	return firstCyvilebi >=5;
}}