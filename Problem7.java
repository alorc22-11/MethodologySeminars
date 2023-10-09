import stanford.karel.*;
public class Problem7 extends SuperKarel{
	public void run(){
		 putBeeper();
		 for(int t=0; t<7; t++){
		    for(int s=0; s<5; s++){
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




		
		



	

	

	



