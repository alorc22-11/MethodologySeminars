import stanford.karel.*;
public class Problem7 extends SuperKarel{
	public void run(){
		 putBeeper();
		 for(int i=0; i<2; i++){
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
		if(frontIsBlocked()){
		   turnLeft();
		   daarige();
	    }
		
	}
}

		
		



	

	

	



