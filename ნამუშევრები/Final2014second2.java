import acm.program.ConsoleProgram;

public class Final2014second2 extends ConsoleProgram{
	public void run(){
		String str = "fedcba";
		println(gashipre(str));
	}

	private String gashipre(String str) {
		char[] arr = new char[26];
		for(int i = 0; i < str.length(); i ++){
			arr[i] = str.charAt(i);
		}
		String nova = "";
		for(int i =0; i< str.length(); i ++){
			for(int k = 0; k < arr.length; k ++){
				if(str.charAt(i)- 'a' == k){
					nova += arr[k];
				}
			}
		}
		return nova;
	}
}
