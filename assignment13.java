import stanford.karel.SuperKarel;

public class assignment13 extends SuperKarel {
	public void run() {
		putBeepersInOrder();
		whatNeedsToBeDoneFacingEast();
		whatNeedsToBeDoneFacingWest();
	}

	private void whatNeedsToBeDoneFacingWest() {
		if (facingWest()) {
			if (noBeepersPresent()) {
				turnRight();
				if (frontIsClear()) {
					move();
					turnRight();
					putBeepersInOrder();
					whatNeedsToBeDoneFacingEast();
				}
			} else {
				turnRight();
				if (frontIsClear()) {
					move();
					turnRight();
					move();
					putBeepersInOrder();
					whatNeedsToBeDoneFacingEast();
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
					whatNeedsToBeDoneFacingWest();
				}
			} else {
				turnLeft();
				if (frontIsClear()) {
					move();
					turnRight();
					turnAround();
					move();
					putBeepersInOrder();
					whatNeedsToBeDoneFacingWest();
				}
			}
		}
	}

	private void putBeepersInOrder() {
		putBeeper();
		if (frontIsClear()) {
			while (frontIsClear()) {
				move();
				if (frontIsClear()) {
					move();
					putBeeper();
				}
			}
		} else {
			turnLeft();
			if (frontIsClear()) {
				while (frontIsClear()) {
					move();
					if (frontIsClear()) {
						move();
						putBeeper();
					}
				}

			}
		}
	}
}


