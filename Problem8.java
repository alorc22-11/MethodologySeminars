import stanford.karel.*;
public class Problem8 extends SuperKarel {
	public void run(){
		move();
		ujra2fafu();
		move();
		move();
		turnAround();
		move();
		move();
		turnAround();
		move();
		mogvareba();
		move();
		move();
		move();	
	}
	private void ujra2fafu(){
		while(beepersPresent()){
				pickBeeper();
				move();
				move();
				putBeeper();
				turnAround();
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
