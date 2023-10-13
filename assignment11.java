import stanford.karel.*;

public class assignment11 extends SuperKarel{

	public void run(){
		kartanMisvla();
		ageba();
		saxlshiShesvla();
		wamowola();
	}

	private void wamowola() {
		turnRight();
		move();
		turnLeft();
		move();
		move();
		turnAround();
		
	}

	private void saxlshiShesvla() {
		turnAround();
		move();
		
	}

	private void ageba() {
		move();
		pickBeeper();
	}

	private void kartanMisvla() {
		turnRight();
		move();
		turnLeft();
		move();
		move();
		
		
	}
	

}
