import stanford.karel.*;

public class assignment12 extends SuperKarel {
	public void run() {
		fixingTheArch();
		getToTheFirstLine();
		while (frontIsClear()) {
			getToTheFollowingArch(); // ro gacherdes tu tagebis sheketebas
										// movrchit da ar gawedos
		}

	}

	private void getToTheFirstLine() {
		turnAround();
		while (frontIsClear()) { // qvevit dabruneba,rom qvevidan zevit
									// sheaketos
			move();
		}
		turnLeft();
	}

	private void getToTheFollowingArch() {
		move();
		move();
		move();
		move(); // shemdeg tagze gadasvla
		fixingTheArch();
		getToTheFirstLine();
	}

	private void fixingTheArch() {
		if (noBeepersPresent()) {
			putBeeper();
		}
		turnLeft();
		while (frontIsClear()) { // unda daalagos beeperebi yvelgan
			move();
			if (noBeepersPresent()) { // tu devs beeperi ar debs
				putBeeper();
			}
		}
	}
}
