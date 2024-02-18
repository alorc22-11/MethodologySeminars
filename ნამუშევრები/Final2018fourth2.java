import java.util.ArrayList;

import acm.program.ConsoleProgram;

public class Final2018fourth2 extends ConsoleProgram {
	public void run() {
		String str = "a-bC-dEf-ghIj";
		println(stranniInverse(str));
	}

	private String stranniInverse(String str) {
		ArrayList<Integer> indexi = new ArrayList<>();
		String coolerStr = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			char ukugma = str.charAt(str.length() - 1 - i);
			if (!((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))) {
				indexi.add(i);
			}
			if ((ukugma >= 'a' && ukugma <= 'z') || (ukugma >= 'A' && ukugma <= 'Z')) {
				coolerStr += ukugma;
			}
		}
		String chemi = makeCoolest(indexi, coolerStr, str);
		return chemi;
	}

	private String makeCoolest(ArrayList<Integer> indexi, String coolerStr, String str) {
		String temp = "";
		int k = 0;
		for (int i = 0; i < str.length(); i++) {
		
				if (indexi.contains(i)) {
					temp += str.charAt(i);
				}else{
					temp+= coolerStr.charAt(k);
					k++;
				}
			
		}
		return temp;
	}


}
