import stanford.karel.*;
public class Meshvide extends SuperKarel{
	public void run(){
		 for(int i=0; i<1000; i++){	
			 putBeeper();
		     daarige();
		     turnLeft();
		     if(noBeepersPresent()){turnLeft();daarige();}
		  
		  
		
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
	
	}
	



