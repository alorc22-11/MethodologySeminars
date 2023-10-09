import stanford.karel.*;
public class Problem7 extends SuperKarel{
	public void run(){
		 putBeeper();
		 daarige();
		 tanmoxveva();
		    
		 

		
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

		
		



	

	

	



