import stanford.karel.*;
public class Problem7 extends SuperKarel{
	public void run(){
		 putBeeper();
		
		    for(int s=0; s<1000; s++){
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
		       if(leftIsClear()){
		    	   move();
		    	   turnLeft();
		       }
		       daarige();
	        
	        }
		    if(leftIsBlocked()){
		    	turnRight();
		    	if(rightIsClear()){
		    		move();
		    		turnRight();
		    	}
		    	daarige();
		    } 
		      
	          
		   
	}
		
}




		
		



	

	

	



