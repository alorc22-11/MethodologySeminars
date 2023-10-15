import stanford.karel.SuperKarel;

public class assignment14 extends SuperKarel {
	public void run() {
		MoveLikeDiagonal();
		goingDown();
		putBeeper();
		turnLeft();

	}

	private void goingDown() {
		if (frontIsBlocked()) { // kvadratis shua nawilidan chamosvla
			turnRight();
			turnRight();
			while (frontIsClear()) {
				move();
			}
		}

	}

	private void MoveLikeDiagonal() { // ase tu ise diagonalze agvyavs
		turnLeft(); // ogond naxevarkvadratis daaxloebit
		if (frontIsClear()) { // am gzis yvela variantshi
			while (frontIsClear()) { // kvadratis shuashi iqneba
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
