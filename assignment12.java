import stanford.karel.*;
public class assignment12 extends SuperKarel{
	public void run(){
		  
		  
			     sheketeba();
			     dabruneba();
			     if(frontIsClear()){
		         gadasvla();
			     }else{
			    	 sheketeba();
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
			sheketeba();
			dabruneba();
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
	



