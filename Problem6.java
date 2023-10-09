import stanford.karel.*;
public class Problem6 extends SuperKarel{
	public void run(){
		move();
		moayomaremeoreujra();
	    move();
	    moayomaremesameujra();
	    move();
		}
	 private void moayomaremesameujra() {
		while(beepersPresent()){
			pickBeeper();
			move();
			putBeeper();
			turnLeft();
			turnLeft();
			move();
			turnLeft();
			turnLeft();
			
			
		}
	}
	private void moayomaremeoreujra(){
		while(beepersPresent()){
			pickBeeper();
		    move();
		    move();
		    putBeeper();
		    turnLeft();
		    turnLeft();
		    move();
		    move();
		    turnLeft();
		    turnLeft();
		 }
	
	
		
	 }
		 
	 }
			
	
		



