import stanford.karel.SuperKarel;

public class assignment13 extends SuperKarel {
	public void run() {
		firstLine();
		// getToSecondLine();
		// check();
		// goon();
	}

	private void firstLine() {
		putBeeper();
		while (frontIsClear()) {
			move();
			move();
		    putBeeper();
		    if(frontIsBlocked()){
		    	turnLeft();
		    }
		}
	}
}

