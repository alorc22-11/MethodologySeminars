import stanford.karel.SuperKarel;

public class assignment14 extends SuperKarel {
	public void run() {
		MoveLikeDiagonal();
		goingDown();

	}

	private void goingDown(){
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
