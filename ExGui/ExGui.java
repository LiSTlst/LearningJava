import java.awt.*;
import javax.swing.*;

public class ExGui{
	private JFrame frame;
	private JButton b1;
	private JButton b2;
	public static void main(String args[]){
		ExGui that = new ExGui();
		that.go();
	}
	public void go(){
		frame = new JFrame("GUI exaple");
		Container contentePane= frame.getContentPane();
		contentePane.setLayout(new FlowLayout());
		b1=new JButton("Press me");
		b2=new JButton("Don't press me");
		contentePane.add(b1);
		contentePane.add(b2);
		frame.pack();
		frame.setVisible(true);
	}
}