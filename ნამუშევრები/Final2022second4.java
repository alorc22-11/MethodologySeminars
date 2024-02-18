import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JTextField;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;
import javafx.event.ActionEvent;

public class Final2022second4 extends GraphicsProgram {

	private static final int BALL_SIZE = 50;
	private JTextField horizon;
	private JTextField vertical;
	private JButton butt;
	private GOval ball;
	private int vx;
	private int vy;
	private RandomGenerator rgen = RandomGenerator.getInstance();

	

	public void run() {
		ball = new GOval(BALL_SIZE, BALL_SIZE);
		ball.setFilled(true);
		ball.setColor(Color.red);
		ball.setLocation(getWidth() / 2 - BALL_SIZE / 2, getHeight() / 2 - BALL_SIZE / 2);
		add(ball);
		 vx = rgen.nextInt(-3,3);
		 vy = rgen.nextInt(-3,3);
			
		 while (true) {
				ball.move(vx, vy);

				pause(20);
				if (ball.getY() <= 0) {
					vy = -vy;
				} else if (ball.getY() + BALL_SIZE >= getHeight()) {
					vy = -vy;
				} else if (ball.getX() <= 0) {
					vx = -vx;
				} else if (ball.getX() + BALL_SIZE >= getWidth()) {
					vx = -vx;
				}
				addActionListeners();
			}

	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == butt) {
			println("here");
			vx = Integer.parseInt(horizon.getText());
			vy = Integer.parseInt(vertical.getText());
			ball.move(vx, vy);
		}
		
		movement();
	}

	private void movement() {
		while (true) {
			ball.move(vx, vy);

			pause(20);
			if (ball.getY() <= 0) {
				vy = -vy;
			} else if (ball.getY() + BALL_SIZE >= getHeight()) {
				vy = -vy;
			} else if (ball.getX() <= 0) {
				vx = -vx;
			} else if (ball.getX() + BALL_SIZE >= getWidth()) {
				vx = -vx;
			}
			addActionListeners();
		}

	}

	public void init() {
		horizon = new JTextField(20);
		add(horizon, SOUTH);
		horizon.addActionListener(this);
		vertical = new JTextField(20);
		add(vertical, SOUTH);
		vertical.addActionListener(this);
		butt = new JButton("add");
		add(butt, SOUTH);
		butt.addActionListener(this);
	
	}
}
