import java.applet.*;
import java.awt.*;

public class RectangleTest extends Applet{
int x,y,w,h;
public void init(){
 x=Integer.parseInt(getParameter("xValue"));
 y=Integer.parseInt(getParameter("yValue"));
 w=Integer.parseInt(getParameter("wValue"));
 h=Integer.parseInt(getParameter("hValue"));
setBackground(Color.RED);}
public void paint(Graphics g){
	String msg;
	msg=getParameter("massege");
g.drawRect(x,y,w,h);
g.drawString("This is my Rectangle",150,150);
g.drawString(msg,200,200);
}
}