import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import acm.graphics.GImage;
import acm.program.GraphicsProgram;

public class Final2014second6 extends GraphicsProgram {
	private ArrayList<String> images = new ArrayList<>();
	public static final int IMG_H = 200;
	public static final int IMG_DST = 20;
	private boolean allPictures = true;
	private GImage currImage;

	private int currIndex;

	public void run() {
		addMouseListeners();
		addImages();
		update();
	}

	public void mouseClicked(MouseEvent e) {
		if (allPictures) {
			int x = e.getX();
			int y = e.getY();
			currIndex = findName(x, y);
			currImage = findObj(x, y);
		
			allPictures = false;
		

		} else {
			if (e.getX() < getWidth() / 3) {
				currImage = findLeft();
			} else if (e.getX() < getWidth() * 2 / 3 && e.getX() > getWidth() / 3) {
				allPictures = true;
			} else if (e.getX() > getWidth() * 2 / 3) {
				println("grdznobs");
				currImage = findRight();
			}
		}
		update();

	}

	private int findName(int x, int y) {
		int left = IMG_DST;
		int right = IMG_DST + IMG_H;
		int top = IMG_DST;
		int bottom = IMG_DST + IMG_H;
		int result = 0;
		println("ak shemovedi");
		for (int i = 0; i < images.size(); i++) {
			if (x < right && x > left) {
				if (y < top && y > bottom) {
					result = i;
					println(i);
				}
			}
			top += IMG_DST + IMG_H;
			bottom += IMG_DST + IMG_H;
			if(right + IMG_DST + IMG_H > getWidth()){
				left = IMG_DST;
				right = IMG_DST + IMG_H;
				
			}

		}
		return result;
	}

	

	private GImage findRight() {
		String right = "";
		if(currIndex != images.size()-1){
			right = images.get(currIndex +1);
			currIndex += 1;
			GImage rightImage = new GImage(right);
			return rightImage;

		}
		return currImage;
	}

	private GImage findLeft() {
		String left = "";
		if(currIndex != 0){
			left = images.get(currIndex - 1);
			currIndex -= 1;
			GImage leftImage = new GImage(left);
			return leftImage;
		}
		return currImage;
	}

	private GImage findObj(int x, int y) {
		if (getElementAt(x, y) != null) {
			return (GImage) getElementAt(x, y);
		}
		return null;
	}

	private void update() {
		removeAll();
		if (allPictures) {
			drawAllPictures();
		} else {
			drawOne();
		}
	}

	private void drawOne() {
		currImage.setSize(getWidth(), getHeight());
		currImage.setLocation(0, 0);
		add(currImage);
	}

	private void drawAllPictures() {
		int x = IMG_DST;
		int y = IMG_DST;
		for (int i = 0; i < images.size(); i++) {
			GImage myImage = new GImage(images.get(i));
			myImage.setSize(IMG_H, IMG_H);
			if (x + IMG_H > getWidth()) {
				y += IMG_DST + IMG_H;
				x = IMG_DST;
			}
			myImage.setLocation(x, y);
			add(myImage);
			x += IMG_DST + IMG_H;
		}
	}

	private void addImages() {
		images.add("Vegan-Chinese-food.jpg");
		images.add("48425572_2132510786799259_5941125331665551360_n.jpg");
		images.add("235452350_375325077270751_5233408348100855060_n_2937f39e_30032018.jpg");
		images.add("istockphoto-637801656-612x612.jpg");
		images.add("shutterstock_1435374326.jpg");
		images.add("Easy-Miso-Ramen_square-0723.jpg");
		images.add("pasta-al-pesto-24-1.jpg");
		images.add("Italian-Pizza.jpg");
		images.add("Caesar-Salad-sq.jpg");
		images.add("side-shot-Korean-corn-dog-thumbnail.jpg");

	}

}
