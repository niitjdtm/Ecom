package Swing;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Swing {

	public static void main(String[] args) {
		JFrame f=new JFrame("application");
		JLabel a,b;
		a=new JLabel("First name");
		a.setBounds(50,50,100,30);
		b=new JLabel("last name");
		b.setBounds(70,70,150,40);
		f.add(a);
		f.add(b);
		f.setSize(300,300);
		f.setLayout(null);
		f.setVisible(true);
		
		
		// TODO Auto-generated method stub

	}

	

}
