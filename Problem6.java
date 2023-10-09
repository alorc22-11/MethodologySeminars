import stanford.karel.*;
public class Problem6 extends SuperKarel{
	public void run(){
		move();
		moayomaremeoreujra();
		move();
		//moayomaremesameujra();
		move();
		}
	 private void moayomaremeoreujra(){
		while(beepersPresent()){
			pickBeeper();
		    move();
		    move();
		    putBeeper();
		 }
		turnAround();
		move();
		move();
		
	
		
	 }
		 
	 }
			
	
		



