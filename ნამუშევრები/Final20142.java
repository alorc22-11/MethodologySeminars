import java.util.StringTokenizer;

import acm.program.ConsoleProgram;

public class Final20142 extends ConsoleProgram{
	public void run(){
		String str = "etErNAl sUNShiNe OF tHe Spotless mIND";
		println(title(str));
	}

	private String title(String str) {
		StringTokenizer tok = new StringTokenizer(str);
		int dim = 0;
		while(tok.hasMoreTokens()){
			dim ++;
		}
		println(dim);
		String[] arr = new String[dim];
		int i = 0;
		while(tok.hasMoreTokens()){
			arr[i] = tok.nextToken();
			i++;
		}
		for(int k = 0 ; k < arr.length; k ++){
			arr[k].toLowerCase();
			arr[k] = (arr[k].charAt(0) +"").toUpperCase() + arr[k].substring(1, arr[k].length()-1);
		}
		String myStr = "";
		for(int j = 0; j < arr.length; j ++){
			myStr += arr[j] + " " ;
		}
		return myStr;
	}
}
