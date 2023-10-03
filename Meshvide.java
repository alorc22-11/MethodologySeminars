import stanford.karel.*;
public class Meshvide extends SuperKarel{
	public void run(){
		 for(int i=0; i<1000; i++){	
			 putBeeper();
		     daarige();
		     mouxvie();
		     daarige();
		
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
	private void mouxvie(){
		if(frontIsClear()){
			daarige();
		}else{ turnLeft();
		
		}
	}

}
