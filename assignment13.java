import stanford.karel.SuperKarel;

public class assignment13 extends SuperKarel {
	public void run() {
		firstLine();
		// getToSecondLine();
		// check();
		// goon();
	}

	private void firstLine() {
		if (frontIsClear()) {
			putBeeper();
			move();
			move();
			putBeeper();

		}

	}
}
