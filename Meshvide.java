import stanford.karel.*;
public class Meshvide extends SuperKarel{
	public void run(){
		 for(int i=0; i<1000; i++){	
			 putBeeper();
		     daarige();
		     Mouxvie();
	

		 }
		
	}
	private void daarige(){
		while(frontIsClear()){
			move();
			if(noBeepersPresent()){
				putBeeper();
			}
		
		}
	}
	private void Mouxvie(){
		if(frontIsBlocked()){turnLeft();}
	}
	
	}
	



