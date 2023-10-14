import stanford.karel.*;
public class assignment12 extends SuperKarel{
	public void run(){
		  
		  
			     sheketeba();
		       //  gadasvla();
	       
	}

	/*private void gadasvla() {
		turnRight();
		if(frontIsClear()){
			move();
			move();
			move();
			move();
			turnRight();
			while(frontIsClear()){
				move();	
			}
			turnLeft();
		}
	}*/


	private void sheketeba() {
		 if(noBeepersPresent()){
			 putBeeper();
		 }
			 turnLeft();
	  while(frontIsClear()){
		  move();
		if(noBeepersPresent()){
		     putBeeper();
		}
	 }
	  turnAround();
    }
}
	



