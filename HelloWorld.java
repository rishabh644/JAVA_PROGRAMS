//my first java applet
//an applet to print hello world
import java.applet.Applet;
import java.awt.Graphics;

public class HelloWorld extends Applet
{
public void init()
{resize(500,400);}
public void paint(Graphics g)
{
g.drawString("Hello World!",150,150); 

}
  }