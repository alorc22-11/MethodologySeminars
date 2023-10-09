import stanford.karel.*;

public class Problem45 extends SuperKarel{
	public void run(){
		putBeeper();
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


