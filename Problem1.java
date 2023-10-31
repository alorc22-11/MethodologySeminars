import stanford.karel.*;
public class Problem1 extends SuperKarel{
	 public void run(){
	move();
	while(leftIsBlocked()){
		move();
	}
	 
}
}
