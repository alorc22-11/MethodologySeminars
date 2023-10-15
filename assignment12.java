import stanford.karel.*;

public class assignment12 extends SuperKarel {
	public void run() {
		fixingTheArch();
		getToTheFirstLine();
		while (frontIsClear()) {
			getToTheFollowingArch();
		}

	}

	private void getToTheFirstLine() {
		turnAround();
		while (frontIsClear()) {
			move();
		}
		turnLeft();
	}

	private void getToTheFollowingArch() {
		move();
		move();
		move();
		move();
		fixingTheArch();
		getToTheFirstLine();
	}

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



