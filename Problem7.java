import stanford.karel.*;
public class Problem7 extends SuperKarel{
	public void run(){
		 putBeeper();
		
		    for(int s=0; s<3; s++){
		        daarige();
		        tanmoxveva();
		   }
		    if(beepersPresent()){
				turnLeft();
				turnLeft();
				move();
				turnRight();
				daarige();
				tanmoxveva();
			}
		    if(frontIsBlocked()){
		    	turnLeft();
		    	turnLeft();
		    	move();
		    	if(facingSouth()){turnLeft();
		    	daarige();
		    	tanmoxveva();
		    	}
		    }else {
		    	turnRight();
		    	daarige();
		    	tanmoxveva();
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
	private void tanmoxveva(){
		if(rightIsBlocked()){
			turnLeft();
			daarige();
		}
		
	}
	
		
}




		
		



	

	

	



