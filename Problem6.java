import stanford.karel.*;
public class Problem6 extends SuperKarel{
	public void run(){
		move();
		while(noBeepersPresent()){
	       pickBeeper();
	       
		}
		move();
		while(noBeepersPresent()){
			pickBeeper();
			
		}
		putBeeper();
	 
			
	}
		
}


