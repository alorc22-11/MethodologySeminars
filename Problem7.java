import stanford.karel.*;
public class Problem7 extends SuperKarel{
	public void run(){
		 putBeeper();
		 daarige();
		    
		 

		
	}
	private void daarige(){
		while(frontIsClear()){
			move();

			if(noBeepersPresent()){
				putBeeper();
			}
		}
	}
}
		
		



	

	

	



