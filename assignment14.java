import stanford.karel.SuperKarel;
public class assignment14 extends SuperKarel {
    public void run(){
    	turnLeft();
    	while(frontIsClear()){
    		move();
    		move();
    		turnRight();
    		move();
    	}
    }
}
