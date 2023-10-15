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
		// brundeba sawyis poziciaze
	}

	private void takeIt() {
		pickBeeper();
		turnAround();
		// aq igebs gazets
	}

	private void goToNewspaper() {
		turnRight();
		move();
		turnLeft();
		move();
		move();
		move();
		// am funqciit migvyavs gazetamde tumca jer ar igebs
	}

}
