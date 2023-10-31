import stanford.karel.*;

public class assignment12 extends SuperKarel {
	public void run() {
		fixingTheArch();
		getToTheFirstLine();
		while (frontIsClear()) {
		getToTheFollowingArch(); 						
		}

	}
	// qvevit dabruneba,rom qvevidan zevit
	// sheaketos
	private void getToTheFirstLine() {
		turnAround();
		while (frontIsClear()) { 
			move();
		}
		turnLeft();
	}
	// shemdeg tagze gadasvla
	private void getToTheFollowingArch() {
		move();
		move();
		move();
		move(); 
		fixingTheArch();
		getToTheFirstLine();
	}
	// unda daalagos beeperebi yvelgan
	// tu devs beeperi ar debs
	private void fixingTheArch() {
		if (noBeepersPresent()) {
			putBeeper();
		}
		turnLeft();
		while (frontIsClear()) { 
			move();
			if (noBeepersPresent()) { 
				putBeeper();
			}
		}
	}
}
