import stanford.karel.*;

public class Meotxe extends SuperKarel{
	public void run(){
		move();
		daarige();
		
		
	}
	private void daarige(){
		while(frontIsClear()){
			move();/* eseigi 5zec mushaobs*/
			if(noBeepersPresent()){
				putBeeper();
				
			}
		
			}
	}
}


