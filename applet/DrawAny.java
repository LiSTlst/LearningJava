import java.awt.*;
import java.applet.*;
import java.net.*;

public class DrawAny extends Applet{
	Image im;
	public void init(){
		URL myPage=getDocumentBase();
		String imageName=getParameter("image");
		im=getImage(myPage, imageName);
	}
	public void paint(Graphics g){
		g.drawImage(im, 0,0, this);
	}
}