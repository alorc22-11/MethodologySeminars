import acm.program.ConsoleProgram;

public class Final20212 extends ConsoleProgram {
	public void run() {
		String str = "EnjoyYourExam";
		int[] indexi = { 5, 9 };
		println(daspeiseba(str, indexi));
	}

	private String daspeiseba(String str, int[] indexi) {
		String temp = "";
		for (int i = 0; i < str.length(); i++) {
			temp += str.charAt(i);
			for (int n = 0; n < indexi.length; n++) {
				if(indexi[n] -1 == i){
					temp += " ";
				}
			}
		}
		return temp;
	}
}
