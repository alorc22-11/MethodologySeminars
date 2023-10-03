import stanford.karel.*;
public class Problem7 extends SuperKarel{
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
		for(int i=0; i<100; i++){
		   if(frontIsBlocked()){
		
			turnLeft();
			daarige();
			if(beepersPresent()){
				move();
				daarige();
				
			}
		   }
		}
	}
	

	

	



