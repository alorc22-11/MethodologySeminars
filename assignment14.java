import stanford.karel.SuperKarel;
public class assignment14 extends SuperKarel {
    public void run(){
    	turnLeft();
    	if(frontIsClear()){
    		while(frontIsClear()){
    		move();
    		move();
    		turnRight();
    		move();
    		turnLeft();
    	}
    	}
    }
}
