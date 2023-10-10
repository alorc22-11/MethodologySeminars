import java.awt.Color;

import acm.graphics.*;
import acm.program.GraphicsProgram;
	
public class seminari extends GraphicsProgram{
    public void run(){
    	
    	
    	
    	
	GRect myRect = new GRect(100,200);
	add(myRect, 100, 150);
	
	//GRect secondRect = new GRect(100,200);
	//add(myrect, 300, 150);
	
	
	GRect oldRect = myRect;
	myRect = new GRect(100,200);
	add(myRect, 300, 150);
	
	
	myRect.setFilled(true);
	oldRect.setFilled(true);
	oldRect.setColor(Color.GREEN);
	
    }
}
