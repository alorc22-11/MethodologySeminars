import java.util.Arrays;

import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

public class Final20211 extends ConsoleProgram{
	private RandomGenerator rgen = RandomGenerator.getInstance();
public void run(){
	int[] arr = {5,4,6,7,3};
	badSort(arr);
	println(Arrays.toString(arr));
}

private void badSort(int[] arr) {
	int[] tempArr = arr;
	while(true){
		int a = rgen.nextInt(0, arr.length-1);
		int b = rgen.nextInt(0, arr.length-1);
		while(true){
			if(a != b){
				break;
			}else{
				b = rgen.nextInt(0, arr.length-1);
			}
		}
		if(a>b){
			int temp = a;
			a = b;
			b = temp;
		}
		if(arr[a] > arr[b]){
			swap(a,b, arr);
		}
		Arrays.sort(tempArr);
		if(tempArr.equals(arr)){
			break;
			
		}
	}
}

private void swap(int a, int b, int[] arr) {
	int temp = arr[a];
	arr[a] = arr[b];
	arr[b] = temp;
}
}
