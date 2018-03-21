package Swing;
import javax.swing.JButton;
import javax.swing.JFrame;
public class JavaJButton 
{
public static void main (String[]args) 
{
	JFrame f=new JFrame("Jbutton");
    JButton b=new JButton("click here");
    b.setBounds(50,100,95,30);
    f.add(b);
    f.setSize(400,400);
    f.setLayout(null);
    f.setVisible(true);
}
}