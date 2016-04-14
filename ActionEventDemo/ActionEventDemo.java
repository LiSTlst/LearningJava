import java.awt.*;
import javax.swing.*;

class ButtonHandler implements ActionListener{
	public void actionPerformed(ActionEvent e){
		System.out.println("Action accourred");
	}
}
public class ActionEventDemo{
	public static void main(String atgs[]){
		JFrame frame=new JFrame("ActionEvent Demo");
		JButton b = new JButton("Press me");

		b.addEventListener(new ButtonHandler());
		frame.getContentPane().add(b,BorderLayout.CENTER);
		frame.pack();
		frame.setVisible(true);
	}
}