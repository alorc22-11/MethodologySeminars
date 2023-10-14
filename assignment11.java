import stanford.karel.*;

public class assignment11 extends SuperKarel {

	public void run() {
		goToNewspaper();
		takeIt();
		getBackToOriginPlace();
	}

	private void getBackToOriginPlace() {

		move();
		turnRight();
		move();
		turnLeft();
		move();
		move();
		turnAround();

	}

	private void takeIt() {
		pickBeeper();
		turnAround();
	}

	private void goToNewspaper() {
		turnRight();
		move();
		turnLeft();
		move();
		move();
		move();

	}

}
