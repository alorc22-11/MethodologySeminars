import stanford.karel.*;

public class Problem2 extends SuperKarel{
 public void run(){
	 move();
	 move();
	 move();
	 move();
	 //shegvidzlia esec for it vqnat,anu for(int i=0; i<4;i++)move();
	 
	  for(int i=0; i<10; i++){
		  pickBeeper();
	  }
	 move();
	 for(int i=0; i<10; i++){
		 putBeeper();
	 }
	 move();
	 
	  
 }
 
	
}
