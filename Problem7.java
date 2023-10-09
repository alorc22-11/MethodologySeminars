import stanford.karel.*;
public class Problem7 extends SuperKarel{
	public void run(){
		 for(int i=0; i<1000; i++){	
			 putBeeper();
		     daarige();
		    
		 }

		
	}
	private void daarige(){
		while(frontIsClear()){
			move();
			if(noBeepersPresent()){
				putBeeper();
			}else {
			}
		
		}
	}
	
	}

	

	

	



