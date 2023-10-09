import stanford.karel.*;
public class Problem7 extends SuperKarel{
	public void run(){
		 putBeeper();
		 for(int s=0; s<1000; s++){
		    for(int i=0; i<3; i++){
		        daarige();
		        tanmoxveva();
		    }
		 turnLeft();
		 turnLeft();
		 move();
		 turnLeft();
		   for(int m=0; m<3; m++){
		       daarige();
		       tanmoxveva();
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
		if(frontIsBlocked()){
		   turnLeft();
		   daarige();
	    }
		
	}
}

		
		



	

	

	



