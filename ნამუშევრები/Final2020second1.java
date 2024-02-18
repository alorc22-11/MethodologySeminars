import java.util.ArrayList;

import acm.program.ConsoleProgram;

public class Final2020second1 extends ConsoleProgram {
	public void run() {
		String str = "freeeunni";
		//int k = 3;
		int k = 7;
		println(power(str, k));
	}

	private String power(String str, int k) {
		ArrayList<String> collection = new ArrayList<>();
		for (int i = 0; i < str.length(); i++) {
			int count = 1;
			String awyoba = str.charAt(i) + "";
			for (int j = i + 1; j < str.length(); j++) {
				if (!((str.charAt(j)+ "").equals(str.charAt(j-1) + "")) ){
					count++;
					if (count > k) {
						collection.add(awyoba);
						break;
					}
				}
				awyoba += str.charAt(j);
			}
		}
		String max = findMax(collection);
		int length = max.length();
		String newer = Integer.toString(length) + "(" + max + ")";
		return newer;
	}

	private String findMax(ArrayList<String> collection) {
		String maxStr = "";
		int max = 0;
		for (int i = 0; i < collection.size(); i++) {
			if (collection.get(i).length() > max) {
				maxStr = collection.get(i);
				max = maxStr.length();
			}
		}
		return maxStr;
	}
}
