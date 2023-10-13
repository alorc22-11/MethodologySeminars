import stanford.karel.*;

public class assignment11 extends SuperKarel{
	
	public void run(){
		gazettanMisvla();
		ageba();
		wamowola();
	}

	private void wamowola() {
		
		move();
		turnRight();
		move();
		turnLeft();
		move();
		move();
		turnAround();
		
	}


	private void ageba() {
		pickBeeper();
		turnAround();
	}

	private void gazettanMisvla() {
		turnRight();
		move();
		turnLeft();
		move();
		move();
		move();
		
		
	}
	

}
