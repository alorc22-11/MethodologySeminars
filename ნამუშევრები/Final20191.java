import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JTextField;

import acm.graphics.GLine;
import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import javafx.event.ActionEvent;

public class Final20191 extends GraphicsProgram {
	private JTextField xField;
	private JTextField yField;
	private JButton addButton;
	private JButton removeButton;
	private ArrayList<Integer> valuex = new ArrayList<>();
	private ArrayList<Integer> valuey = new ArrayList<>();
	
	
	
	public void actionPerformed(ActionEvent e){
		println("here");
		if(e.getSource() == addButton){
			println("here");
			
			fillList();
			
		}
		update();
	}
	
	private void update() {
		println("here");
		removeAll();
		if(valuex.size()==1){
			
			GOval oval = new GOval(20,20);
			oval.setLocation(valuex.get(0) - 10,valuey.get(0) -10);
			add(oval);
			
		}else{
			for(int i = 1 ; i< valuex.size(); i ++){
				GLine line = new GLine(valuex.get(i-1), valuey.get(i-1), valuex.get(i), valuey.get(i));
				add(line);
			}
		}
	}

	private void fillList() {
		int x = Integer.parseInt(xField.getText());
		int y = Integer.parseInt(yField.getText());
		if(!valuex.contains(x)){
			valuex.add(x);
			valuey.add(y);
		}
	}

	public void run() {

	}

	public void init() {
		xField = new JTextField(20);
		add(xField, SOUTH);
		yField = new JTextField(20);
		add(yField, SOUTH);
		addButton = new JButton("add");
		add(addButton, SOUTH);
		addButton.addActionListener(this);
		removeButton = new JButton("remove");
		add(removeButton, SOUTH);
		removeButton.addActionListener(this);
		addActionListeners();
	}
}
