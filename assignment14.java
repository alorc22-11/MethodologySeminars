import stanford.karel.SuperKarel;

public class assignment14 extends SuperKarel {
	
	public void run() {
		MoveLikeDiagonal();
		goingDown();
		putBeeper();
		turnLeft();

	}
	// kvadratis shua nawilidan chamosvla
	private void goingDown() {
		if (frontIsBlocked()) { 
			turnRight();
			turnRight();
			while (frontIsClear()) {
				move();
			}
		}

	}
	 /*ase tu ise diagonalze agvyavs
	   ogond naxevarkvadratis daaxloebit	
	   am gzis yvela variantshi	
	   kvadratis shuashi iqneba
	 */
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
