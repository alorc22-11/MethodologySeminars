import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

import acm.program.ConsoleProgram;

public class Final20201 extends ConsoleProgram {
	public void run() {
		String str = "keep calm and code on";
		println(rearange(str));
	}

	private String rearange(String str) {
		ArrayList<String> words = new ArrayList<>();
		StringTokenizer tok = new StringTokenizer(str);
		while (tok.hasMoreTokens()) {
			words.add(tok.nextToken());
		}

		String[] correct = new String[words.size()];
		
		for (int index = correct.length -1; index >= 0; index--) {
			int maxLength = 0;
			String maxWord = "";
			for (int i = 0; i < words.size(); i++) {
				if (words.get(i).length() >= maxLength) {
					maxWord = words.get(i);
					maxLength = maxWord.length();
				}

			}
			correct[index] = maxWord;
			words.remove(maxWord);
			
		}
		return Arrays.toString(correct);
	}
}
