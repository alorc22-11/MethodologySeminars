import stanford.karel.*;
public class Problem8 extends SuperKarel {
	public void run(){
		move();
		ujra2fafu();
		move();
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

		
		
	


