import acm.program.ConsoleProgram;

public class Final20185 extends ConsoleProgram{
public void run(){
	String str = "a3tx2z";
	println(anapetkebi(str));
}

private String anapetkebi(String str) {
	String myString = "";
	int ramdenjer = 0;
	for(int i = 0; i < str.length();  i++){
		if(str.charAt(i)< 'a'){
			if(i!= str.length()-1){
			ramdenjer = Integer.parseInt(str.charAt(i)+"");
			for(int k = 0; k < ramdenjer; k ++){
				myString += str.charAt(i+1);
			
			}
			i++;}
		}else{
			myString += str.charAt(i);
		}
	}
	return myString;
}
}
