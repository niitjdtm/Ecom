import java.awt.Color;
import java.awt.Component;
import javax.swing.*;

public class Swingtabbedpane {
    JFrame j=new JFrame();
JPanel p1=new JPanel();
JPanel p2=new JPanel();
JButton b=new JButton("Button1");
JButton c=new JButton("BUtton2");
JTabbedPane t=new JTabbedPane();
            public Swingtabbedpane() {
        j.setTitle("JPANEL DEMO");
        j.setVisible(true);
        j.setSize(300, 200);
        j.add(p1);j.add(p2);
       p1.setBounds(50,100,80,30);
       b. setBackground(Color.yellow);
       c. setBackground(Color.red);
       p1.add(b);
       p2.add(c);
       t.addTab("Tab1", p1);
       t.addTab("Tab2", p2);
        Component add = j.add(t);
    }
        public static void main(String[] args) {
        Swingtabbedpane t=new Swingtabbedpane();
    }
		public void addTab(String string, JPanel p12) {
			// TODO Auto-generated method stub
			
		}
    
}