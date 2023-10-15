import stanford.karel.SuperKarel;

public class assignment13 extends SuperKarel {
	public void run() {
		putBeepersInOrder();
		whatNeedsToBeDoneFacingEast();
		whatNeedsToBeDoneFacingWest();
	}

	private void whatNeedsToBeDoneFacingWest() {
		if (facingWest()) {
			if (noBeepersPresent()) { // tu marcxniv iyureba rogor unda mouxvios
				turnRight(); // ro sxva shemdeg xazzec gaagrdzelos dalageba
				if (frontIsClear()) { // beeperebis
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
				turnLeft(); // marjvnis ro iyureba,rogor unda mouxvios
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
					move(); // beeperebis darigeba ertis gamotovebit
					putBeeper();
				}
			}
		} else { // rom boloshi karelma ar gawedos
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
