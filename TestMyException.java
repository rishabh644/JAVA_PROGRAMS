import java.lang.Exception;
class MyException extends Exception{
MyException(String message){
super(message);
                         }
             }

class TestMyException{
public static void main(String [] args)
{
int x=5;
int y=1000;
try{
     float z=(float)x/(float)y;
	 if(z<0.01) throw new MyException("Given data are not proper");    /*throw object of MyException class*/
	 }
	 
	 catch(MyException e){
	 System.out.println(e.getMessage());
	 }
	 
	 }
	   }
	 