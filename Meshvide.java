import stanford.karel.*;
public class Meshvide extends SuperKarel{
	public void run(){
		putBeeper();
		daarige();
		mouxvie();
		
		
	}
	private void daarige(){
		while(frontIsClear()){
			move();
			if(noBeepersPresent()){
				putBeeper();
			}
			
		}
	}
	private void mouxvie(){
		if(frontIsClear()){
			daarige();
		}else{ turnLeft();
		
		}
	}

}
