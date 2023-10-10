import stanford.karel.*;
public class Problem8 extends SuperKarel {
	public void run(){
		move();
		ujra2fafu();
		mogvareba();
			
	}
	private void ujra2fafu(){
		while(beepersPresent()){
				pickBeeper();
				move();
				move();
				putBeeper();
				turnAround();
				move();
				move();
				turnAround();
		}
	}
	private void mogvareba(){
		move();
		while(beepersPresent()){
			pickBeeper();
			move();
			pickBeeper();
			turnAround();
			move();
			move();
			turnAround();
		}
	}
}

		
		
	


