import stanford.karel.*;

public class Problem7 extends SuperKarel {
	public void run(){
		 putBeeper();
		
		    for(int s=0; s<3; s++){
		        daarige();
		        tanmoxveva();
		   }
		    if(beepersPresent()){
		    	turnLeft();
		    	turnLeft();
		    	move();
		    	turnRight();
		    	for(int s=0; s<3; s++){
			        daarige();
			        tanmoxveva();
		    	}
		    }
		    
				  /*   if(facingSouth()){
				    	turnLeft();
				    	turnLeft();
				    	move();
				    	turnRight();
				    	daarige();
				    	tanmoxveva();
		    }
				    if(facingEast()){
				    	turnLeft();
				    	turnLeft();
				    	move();
				    	turnLeft();
				    	turnLeft();
				    	turnLeft();
				    	daarige();
				    	tanmoxveva();
		    }
		           if(facingNorth()){
		            	turnLeft();
		            	turnLeft();
		            	move();
		            	turnLeft();
		            	turnLeft();
		            	turnLeft();
		            	daarige();
		            	tanmoxveva();
		            }
		           if(facingWest()){
		        	   turnLeft();
		        	   turnLeft();
		        	   move();
		        	   turnRight();
		        	   daarige();
		        	   tanmoxveva();
		        	   
		           }*/
	 
		//sxva algoritmit vcdilob amoxsnas,wreze minda daartyas
	}

	private void daarige() {
		while (frontIsClear()) {
			move();

			if (noBeepersPresent()) {
				putBeeper();
			}
		}
	}

	private void tanmoxveva() {
		if (rightIsBlocked()) {
			turnLeft();
			daarige();
		}

	}

}


		
		



	

	

	



