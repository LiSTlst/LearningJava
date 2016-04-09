import java.awt.*;
import javax.swing.*;

public class PanelWithThreebuttons{
	JFrame frame;
	JPanel panel;
	JButton button1,button2,button3;
	Color myNewRed = new Color (232, 89, 87);
	Color myNewYellow = new Color (255, 235, 59);
	Color myNewBlue = new Color (0, 150, 136);
	public static void main(String[] args){
		PanelWithThreebuttons demo=new PanelWithThreebuttons();
		demo.go();
	}
	void go(){
		frame=new JFrame("My Frame");
		panel=new JPanel();
		button1=new JButton("Open");
		button2=new JButton("Close");
		button3=new JButton("Back");
		button1.setBackground(myNewBlue);
		button2.setBackground(myNewBlue);
		button3.setBackground(myNewBlue);		
		frame.getContentPane().setBackground(myNewYellow);
		panel.setBackground(myNewRed);
		frame.getContentPane().add(panel,BorderLayout.SOUTH);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		frame.setSize(600,600);
		frame.setVisible(true);
	}
}