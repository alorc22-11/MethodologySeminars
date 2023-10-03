import stanford.karel.*;
public class Meshvide extends SuperKarel{
	public void run(){
		 for(int i=0; i<1000; i++){	
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
		if(noBeepersPresent()){
			daarige();
		}else{ turnLeft();
		
		}
	}
	
	}


