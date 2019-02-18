package jpt;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class jpt511 extends JFrame{

	private JLabel item1;
	
	public jpt511() {
		super("The title bar");
		setLayout(new FlowLayout());
		
		item1 = new JLabel("this is a sentence");
		item1.setToolTipText("This is gonna show up on hover");
		add(item1);
	}
}
