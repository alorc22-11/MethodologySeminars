import stanford.karel.*;
public class Problem7 extends SuperKarel{
	public void run(){
		 putBeeper();
		
		    for(int s=0; s<3; s++){
		        daarige();
		        tanmoxveva();
		   }
		    if(facingSouth()){
		    	turnLeft();
		    	turnLeft();
		    	move();
		    	turnRight();
		    	daarige();
		    	tanmoxveva();
		    }
		    //if(facingEast()){
		    	//turnLeft();
		    	//move();
		    	//turnLeft();
		    	//turnLeft();
		    	//turnLeft();
		    	//turnLeft();
		    	//daarige();
		    	//tanmoxveva();
		   // }
		  
	
		
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




		
		



	

	

	



