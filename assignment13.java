import stanford.karel.SuperKarel;

public class assignment13 extends SuperKarel {
	public void run() {
		putBeepersInOrder();
		getToSecondLine();
		// check();
		// goon();
	}

	private void getToSecondLine() {
		if (noBeepersPresent()) {
			turnLeft();
			if (frontIsClear()) {
				move();
				turnRight();
				turnAround();
				putBeepersInOrder();
			}
		}else{
			turnLeft();
			if(frontIsClear()){
				move();
				turnRight();
				turnAround();
				move();
				putBeepersInOrder();
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


