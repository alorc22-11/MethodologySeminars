import stanford.karel.*;
public class assignment12 extends SuperKarel{
	public void run(){
		sheketeba();
		//gadasvla();
	}

	//private void gadasvla() {
		// TODO Auto-generated method stub
		
	//}

	private void sheketeba() {
	turnLeft();
	while(frontIsClear()){
		if(noBeepersPresent()){
		putBeeper();
		move();
		}
	}
	}


}
