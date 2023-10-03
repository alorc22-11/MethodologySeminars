import stanford.karel.*;
public class Problem6 extends SuperKarel{
	public void run(){
		move();
		
	while(noBeeperPresent())
	       {pickBeeper();
		}
	
	for (int i=0; i<n; i++){
			pickBeeper();
			}
		
		move();
	     boolean m=beepersPresent();
		for (int i=0; i<m; i++){
			pickBeeper();
			}
		move();
		int x=m+n
		for (int i=0;i<x; i++){
			putBeeper();
		}	
			
	}
		
}


