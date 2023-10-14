import stanford.karel.*;
public class assignment12 extends SuperKarel{
	public void run(){
		  
		  
			     sheketeba();
			     dabruneba();
			     while(frontIsClear()){
		         gadasvla();
			     }
	       
	}

     private void dabruneba() {
    	  turnAround();
    	  while(frontIsClear()){
    		  move();
    	  }
    	  turnLeft();
    	  
	}

	private void gadasvla() {
			move();
			move();
			move();
			move();
	}


	private void sheketeba() {
		 if(noBeepersPresent()){
			 putBeeper();
		 }
			 turnLeft();
	  while(frontIsClear()){
		  move();
		if(noBeepersPresent()){
		     putBeeper();
		}
	 }
    }
}
	



