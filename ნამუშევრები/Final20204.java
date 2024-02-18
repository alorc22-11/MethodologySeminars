import java.awt.event.ActionEvent;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import acm.graphics.GLabel;
import acm.program.GraphicsProgram;
import acm.program.Program;
import acm.util.RandomGenerator;

public class Final20204 extends GraphicsProgram implements ComponentListener {
	private JLabel nameLabel;
	private JTextField nameField;
	private JLabel numLabel;
	private JTextField numField;
	private JButton addButton;
	private static final int MARGIN_X = 20;
	private static final int MARGIN_Y = 20;
	private HashMap<String, String> hm = new HashMap<>();
	private boolean resize = false;
	private RandomGenerator rgen = RandomGenerator.getInstance();

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == addButton) {
			if (nameField.getText() != null && numField.getText() != null) {
				fillMap();
			}
		}
		update();
	}

	private void update() {
		removeAll();
		int x = MARGIN_X;
		int y = MARGIN_Y;
		if (!resize) {
			ArrayList<String> names = new ArrayList<>();
			for (String name : hm.keySet()) {
				names.add(name);
			}
			for (int i = 0; i < names.size(); i++) {
				String both = names.get(i) + " " + hm.get(names.get(i));
				GLabel label = new GLabel(both);
				label.setLocation(x, y);
				add(label);
				y += label.getHeight() + MARGIN_Y;
			}
		} else {
			ArrayList<String> names = new ArrayList<>();
			for (String name : hm.keySet()) {
				names.add(name);
			}
			for (int i = 0; i < names.size(); i++) {
				int index = rgen.nextInt(0, names.size() - 1);
				String both = names.get(index) + " " + hm.get(names.get(index));
				GLabel label = new GLabel(both);
				label.setLocation(x, y);
				add(label);
				y += label.getHeight() + MARGIN_Y;
				names.remove(index);
				resize = false;
			}

		}
	}

	private void fillMap() {
		String name = nameField.getText();
		String num = numField.getText();
		if (hm.containsKey(name)) {
			hm.replace(name, num);
		} else {
			hm.put(name, num);
		}
	}

	public void init() {
		addButtons();
		addActionListeners();
		addComponentListener(this);
	}

	private void addButtons() {
		nameLabel = new JLabel("Name");
		add(nameLabel, SOUTH);
		nameField = new JTextField(25);
		add(nameField, SOUTH);
		numLabel = new JLabel("Phone");
		add(numLabel, SOUTH);
		numField = new JTextField(25);
		add(numField, SOUTH);
		addButton = new JButton("add");
		add(addButton, SOUTH);
	}

	@Override
	public void componentHidden(ComponentEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void componentMoved(ComponentEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void componentResized(ComponentEvent arg0) {
		resize = true;
		update();
	}

	@Override
	public void componentShown(ComponentEvent arg0) {
		// TODO Auto-generated method stub

	}
}
