import stanford.karel.*;

public class assignment11 extends SuperKarel {

	public void run() {
		goToNewspaper();
		takeIt();
		getBackToOriginPlace();
	}
	// brundeba sawyis poziciaze
	private void getBackToOriginPlace() {
		move();
		turnRight();
		move();
		turnLeft();
		move();
		move();
		turnAround();
		
	}
	// aq igebs gazets
	private void takeIt() {
		pickBeeper();
		turnAround();
		
	}
	// am funqciit migvyavs gazetamde tumca jer ar igebs
	private void goToNewspaper() {
		turnRight();
		move();
		turnLeft();
		move();
		move();
		move();
		
	}

}
