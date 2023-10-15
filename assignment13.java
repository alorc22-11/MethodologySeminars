import stanford.karel.SuperKarel;

public class assignment13 extends SuperKarel {
	public void run() {
		putBeepersInOrder();
		whatNeedsToBeDoneFacingEast();
		whatNeedsToBeDoneFacingWest();
	
		// goon();
	}

	private void whatNeedsToBeDoneFacingWest() {
		if (facingWest()) {
			if (noBeepersPresent()) {
				turnRight();
				if (frontIsClear()) {
					move();
					turnRight();
					putBeepersInOrder();
				}
			} else {
				turnRight();
				if (frontIsClear()) {
					move();
					turnRight();
					move();
					putBeepersInOrder();
				}
			}
		}
		
	}

	private void whatNeedsToBeDoneFacingEast() {
		if (facingEast()) {
			if (noBeepersPresent()) {
				turnLeft();
				if (frontIsClear()) {
					move();
					turnRight();
					turnAround();
					putBeepersInOrder();
				}
			} else {
				turnLeft();
				if (frontIsClear()) {
					move();
					turnRight();
					turnAround();
					move();
					putBeepersInOrder();
				}
			}
		}
	}

	private void putBeepersInOrder() {
		putBeeper();
		while (frontIsClear()) {
			move();
			if (frontIsClear()) {
				move();
				putBeeper();
			}

		}
	}
}


