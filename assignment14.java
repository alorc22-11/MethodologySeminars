import stanford.karel.SuperKarel;

public class assignment14 extends SuperKarel {
	public void run() {
		MoveLikeDiagonal();

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
				move();
				turnRight();
				move();
				turnLeft();
			}
		}
	}
}
