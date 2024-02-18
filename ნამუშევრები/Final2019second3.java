import java.util.ArrayList;
import java.util.StringTokenizer;

import acm.program.ConsoleProgram;

public class Final2019second3 extends ConsoleProgram {
	public void run() {
		String s = "hello old world";
		println(axloblebi(s));
	}

	private String axloblebi(String s) {
		ArrayList<String> list = new ArrayList<>();
		StringTokenizer tok = new StringTokenizer(s);
		while (tok.hasMoreTokens()) {
			list.add(tok.nextToken());
		}
		String axlo = findAxlo(list);
		return axlo;
	}

	private String findAxlo(ArrayList<String> list) {
		ArrayList<String> all = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			for (int k = i + 1; k < list.size(); k++) {
				if (axlooben(list.get(i), list.get(k))) {
					String str = list.get(i) + " : " + list.get(k);
					all.add(str);
				}
			}
		}
		String magari = findMax(all);
		return magari;
	}

	private String findMax(ArrayList<String> all) {
		String maxStr = "";
		int max = 0;
		for(int i = 0; i < all.size(); i ++){
			if(all.get(i).length()>max){
				maxStr = all.get(i);
				max = maxStr.length();
			}
		}
		return maxStr;
	}

	private boolean axlooben(String string, String string2) {

		String more = string2;
		String less = string;

		if (string.length() > string2.length()) {
			more = string;
			less = string2;
		}
		for (int i = 0; i < more.length(); i++) {
			if(!less.contains(more.charAt(i)+"")){
				more = more.substring(0,i) + more.substring(i + 1);
				i--;
			}
		}
		if(less.equals(more)){
			return true;
		}
		return false;
	}
}
