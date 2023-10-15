import stanford.karel.SuperKarel;

public class assignment14 extends SuperKarel {
	public void run() {
		MoveLikeDiagonal();
		goingDown();
		putBeeper();
		turnLeft();

	}

	private void goingDown() {
		if (frontIsBlocked()) {
			turnRight();
			turnRight();
			while (frontIsClear()) {
				move();
			}
		}

	}

	private void MoveLikeDiagonal() {
		turnLeft();
		if (frontIsClear()) {
			while (frontIsClear()) {
				move();
				if (frontIsClear()) {
					move();
					turnRight();
					move();
					turnLeft();
				}
			}
		}
	}
}
