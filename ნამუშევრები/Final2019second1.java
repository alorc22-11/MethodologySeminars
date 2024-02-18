import java.awt.Color;
import java.awt.event.ActionEvent;

import javax.swing.JButton;

import acm.graphics.GRect;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class Final2019second1 extends GraphicsProgram {
	private JButton right;
	private JButton left;
	private GRect rect;
	private double vx = 3.0;
	private double vy = 0.0;
	private RandomGenerator rgen = RandomGenerator.getInstance();
	private GRect coolRect;
	

	public void run() {
		while (true) {

			rect.move(vx, vy);
			pause(3);
			changeVelocity();
		}
	}

	private void changeVelocity() {

		double a = rgen.nextDouble(-3.0, 3.0);
		double b = Math.sqrt(9.0 - a * a);
		vx = a;
		if (rgen.nextBoolean()) {
			vy = b;
		} else {
			vy = -b;
		}
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == left){
			coolRect.setLocation(coolRect.getX() - 3, coolRect.getY());
		}
		if(e.getSource() == right){
			coolRect.setLocation(coolRect.getX() +3, coolRect.getY());
			
		}
	}

	public void init() {
		
		left = new JButton("left");
		add(left, SOUTH);
		right = new JButton("right");
		add(right, SOUTH);
		addActionListeners();
		makerects();

	}

	private void makerects() {
		rect = new GRect(50, 50);
		rect.setLocation(0, 0);
		rect.setFilled(true);
		rect.setColor(Color.blue);
		add(rect);
		coolRect = new GRect(50, 50);
		coolRect.setLocation(getWidth() / 2 - 25, getHeight() / 2 - 25);
		coolRect.setFilled(true);
		coolRect.setColor(Color.yellow);
		add(coolRect);
	}

}
