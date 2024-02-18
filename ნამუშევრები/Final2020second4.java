import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import acm.graphics.GObject;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;


public class Final2020second4 extends GraphicsProgram {
	private JLabel nameLabel;
	private JLabel xLabel;
	private JLabel yLabel;
	private JLabel widthLabel;
	private JLabel heightLabel;
	private JTextField nameField;
	private JTextField xField;
	private JTextField yField;
	private JTextField widthField;
	private JTextField heightField;
	private JButton addButton;
	
	private String lastRectName = "";
	

	private HashMap<String, HashMap<String, Integer>> hm = new HashMap<>();
	public void mouseClicked(MouseEvent o){
		double x = o.getX();
		double y = o.getY();
		GObject obj = getObj(x,y);
		if(obj != null){
			if(!lastRectName.equals("")){
				
				String currName = findName(x,y);
				if(currName.charAt(0)== lastRectName.charAt(0)){
					removeFromMap(currName);
					lastRectName = "";
				}else{
					lastRectName = currName;
				}
			}else{
				lastRectName = findName(x, y);
			}
		}
		update();
	}
	private String findName(double x, double y) {
		String name = "";
		for(String rect : hm.keySet()){
			int left = hm.get(rect).get("x");
			int top = hm.get(rect).get("y");
			int  right = left + hm.get(rect).get("width");
			int bottom = top +  hm.get(rect).get("height");
			if(x < right && x > left && y < bottom && y > top){
				name = rect;
			}
		}
		return name;
	}
	
	private void removeFromMap(String currName) {
		hm.remove(currName);
		hm.remove(lastRectName);
	}
	private GObject getObj(double x, double y) {
		if(getElementAt(x,y)!= null){
			return getElementAt(x,y);
		}else{
			return null;
		}
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource() == addButton){
			println("daechira");
			fillMap();
			
			
			
			
		}
		update();
	}
	

	private void update() {
		removeAll();
		for(String rect : hm.keySet()){
			int x = hm.get(rect).get("x");
			int y = hm.get(rect).get("y");
			int width = hm.get(rect).get("width");
			int height = hm.get(rect).get("height");
			GRect myRect = new GRect(width, height);
			myRect.setFillColor(Color.white);
			myRect.setLocation(x,y);
			add(myRect);
		}
	}


	private void fillMap() {
		String name = nameField.getText();
	
		int xCoord = Integer.parseInt(xField.getText());
		int yCoord = Integer.parseInt(yField.getText());
		int rectWidth = Integer.parseInt(widthField.getText());
		int rectHeight = Integer.parseInt(heightField.getText());
		HashMap<String, Integer> allInfo = new HashMap<>();
		allInfo.put("x", xCoord);
		allInfo.put("y", yCoord);
		allInfo.put("width", rectWidth);
		allInfo.put("height", rectHeight);
		if(hm.containsKey(name)){
			hm.replace(name, allInfo);
		
		}else{
			hm.put(name, allInfo);
		}
	}


	public void init() {
		nameLabel = new JLabel("name");
		add(nameLabel, SOUTH);
		nameField = new JTextField(5);
		add(nameField, SOUTH);
		nameField.addActionListener(this);
		xLabel = new JLabel("x");
		add(xLabel, SOUTH);
		xField = new JTextField(5);
		add(xField, SOUTH);
		xField.addActionListener(this);
		yLabel = new JLabel("y");
		add(yLabel, SOUTH);
		yField = new JTextField(5);
		add(yField, SOUTH);
		yField.addActionListener(this);
		widthLabel = new JLabel("width");
		add(widthLabel, SOUTH);
		widthField = new JTextField(5);
		widthField.addActionListener(this);
		add(widthField, SOUTH);
		heightLabel = new JLabel("height");
		add(heightLabel, SOUTH);
		heightField = new JTextField(5);
		add(heightField, SOUTH);
		heightField.addActionListener(this);
		addButton = new JButton("add");
		add(addButton, SOUTH);
		addButton.addActionListener(this);  
		addActionListeners();
		addMouseListeners();
	}
}
