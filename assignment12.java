import stanford.karel.*;
public class assignment12 extends SuperKarel{
	public void run(){
		  
		    sheketeba();
		    gadasvla();
	      
	}

	private void gadasvla() {
		turnRight();
		if(frontIsClear()){
			move();
			move();
			move();
			move();
			turnRight();
			//while(frontIsClear()){
				//move();
			}
		}
	


	private void sheketeba() {
	turnLeft();
	while(frontIsClear()){
		if(noBeepersPresent()){
		putBeeper();
		move();
		   }else{
		    move();
		   }
		}
	
		
		
	}
	}



