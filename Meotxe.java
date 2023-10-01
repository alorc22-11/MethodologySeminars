import stanford.karel.*;

public class Meotxe extends SuperKarel{
	public void run(){
		putBeeper();
		daarige();
		
		
	}
	private void daarige(){
		while(frontIsClear()){
			move();
			if(noBeepersPresent()){
				putBeeper();
				
			}
		
			}
	}
}


