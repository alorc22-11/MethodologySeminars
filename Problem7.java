import stanford.karel.*;
public class Problem7 extends SuperKarel{
	public void run(){
		 putBeeper();
		
		    for(int s=0; s<1000; s++){
		        daarige();
		        tanmoxveva();
		    
		 turnLeft();
		 turnLeft();
		    while(rightIsBlocked()){
			 move();
		     } 
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
		
	        if(rightIsBlocked()){
		       turnLeft();
		       daarige();
	        }  
		   
	}
		
}




		
		



	

	

	



