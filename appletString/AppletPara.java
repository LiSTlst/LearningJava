import java.awt.*;
import java.applet.*;
public class AppletPara extends Applet{
	String s1,s2;
	public void init(){
		s1=getParameter("p1");
		s2=getParameter("p2");
	}
	public void paint(Graphics g){
		g.drawString(s1,10,10);
		g.drawString(s2,10,30);
	}
}