import stanford.karel.*;
public class Problem7 extends SuperKarel{
	public void run(){
		 putBeeper();
		 for(int s=0; s<3; s++){
		   for(int i=0; i<3; i++){
		        daarige();
		        tanmoxveva();
		   }
		 turnLeft();
		 turnLeft();
		 move();
		 turnRight();
		 
		  
		    
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
		if(facingWest()){ 
		    if(leftIsBlocked()){
		       turnLeft();
		       daarige();
	        }
	    }
	}
}

		
		



	

	

	



