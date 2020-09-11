import Interface2.*;

class To_call
{
public static void main(String [] args)
{
	Callback obj=new Client();
	obj.callback(788);
	Callback obj1=new AnotherClient();
	obj1.callback(12);
 }
}