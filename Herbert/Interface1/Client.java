import Interface2.*;

class Client implements Callback{
public void callback(int para)// when  you implements class method it must  be declared as public
{
System.out.println("Callback you on "+para);
   }
}