import stanford.karel.*;
public class assignment12 extends SuperKarel{
	public void run(){
		  
		   while(frontIsClear()) {
			     sheketeba();
		         gadasvla();
	       }
	}

	private void gadasvla() {
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



