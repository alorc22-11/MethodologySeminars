import stanford.karel.SuperKarel;

public class assignment13 extends SuperKarel {
	public void run() {
		putBeepersInOrder();
		whatNeedsToBeDoneFacingEast();
		whatNeedsToBeDoneFacingWest();
	}
	// tu marcxniv iyureba rogor unda mouxvios
	// ro sxva shemdeg xazzec gaagrdzelos dalageba beeperebis
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
	// marjvnis ro iyureba,rogor unda mouxvios
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
	// beeperebis darigeba ertis gamotovebit
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
