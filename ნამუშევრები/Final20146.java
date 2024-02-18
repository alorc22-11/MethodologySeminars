import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JButton;

import acm.graphics.GImage;
import acm.program.GraphicsProgram;

public class Final20146 extends GraphicsProgram{
	public static final int MIN_DRAG = 50;
	public static final int SMALL_IMG_H = 200;
	public static final int BIG_IMG_H = 500;
	public static final int IMG_DST = 20;

	private ArrayList<String> images = new ArrayList<String>();
	private GImage currImage;
	private int currIndex = 0;
	private JButton leftButton;
	private JButton rightButton;
	private double lastMousePress;
	private double lastMouseRelease;
	public void actionPerformed(ActionEvent e ){
		if(e.getSource() == leftButton){
			currImage = findLeft();
		}else if(e.getSource() == rightButton){
			currImage = findRight();
		}
		update();
	}
	
	public void mousePressed(MouseEvent e){
		lastMousePress = e.getX();
	}
	public void mouseReleased(MouseEvent o){
		lastMouseRelease = o.getX();
		if(lastMouseRelease - lastMousePress >MIN_DRAG){
			currImage = findLeft();
		}
		if(lastMousePress - lastMouseRelease > MIN_DRAG){
			currImage = findRight();
		}
		update();
	}
private GImage findRight() {
	if(currIndex != images.size()-1){
		String right = images.get(currIndex +1);
		currIndex ++;
		GImage myImage = new GImage(right);
		return myImage;
	}else{
		return currImage;
	}
	}
private GImage findLeft() {
		if(currIndex != 0){
			String left = images.get(currIndex -1);
			currIndex --;
			GImage myImage = new GImage(left);
			return myImage;
		}else{
			return currImage;
		}
	}
public void run(){
	addMouseListeners();
	addImages();
	currImage = new GImage(images.get(0));
	
	update();
}
private void update() {
	removeAll();
	drawMain();
	drawLeft();
	drawRight();
	
}
private void drawRight() {
	int x = getWidth()/2 + BIG_IMG_H/2 + IMG_DST;
	int y = getHeight()/2 - SMALL_IMG_H/2;
	for(int i = currIndex + 1; i <= images.size() -1 ; i ++){
		GImage myImage = new GImage(images.get(i));
		myImage.setSize(SMALL_IMG_H, SMALL_IMG_H);
		myImage.setLocation(x, y);
		add(myImage);
		x += SMALL_IMG_H - IMG_DST;
		
	}
}
private void drawLeft() {
	int x = getWidth()/2 - BIG_IMG_H/2 - IMG_DST - SMALL_IMG_H;
	int y = getHeight()/2 - SMALL_IMG_H/2;
	for(int i = currIndex - 1; i >= 0; i --){
		GImage myImage = new GImage(images.get(i));
		myImage.setSize(SMALL_IMG_H, SMALL_IMG_H);
		myImage.setLocation(x, y);
		add(myImage);
		x -= SMALL_IMG_H - IMG_DST;
		
	}
}
private void drawMain() {
	currImage.setSize(BIG_IMG_H, BIG_IMG_H);
	currImage.setLocation(getWidth()/2 - BIG_IMG_H/2, getHeight()/2 - BIG_IMG_H/2);
	add(currImage);
}
private void addImages() {
	images.add("Vegan-Chinese-food.jpg");
	images.add("48425572_2132510786799259_5941125331665551360_n.jpg");
	images.add("235452350_375325077270751_5233408348100855060_n_2937f39e_30032018.jpg");
	images.add("istockphoto-637801656-612x612.jpg");
	images.add("shutterstock_1435374326.jpg");
}
public void init(){
	leftButton = new JButton("left");
	add(leftButton, SOUTH);
	leftButton.addActionListener(this);
	rightButton = new JButton("right");
	add(rightButton, SOUTH);
	rightButton.addActionListener(this);
	addActionListeners();
}
}
