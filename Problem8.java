import stanford.karel.*;
public class Problem8 extends SuperKarel {
	public void run(){
		move();
		ujra2fafu();
		move();
		move();
		//mogvareba();
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
		}
	}

}
