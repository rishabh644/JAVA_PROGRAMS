
import java.io.FileInputStream; 

public class Demonstration_124 {

            public static void main(String ar[]) {
			 try {
			 FileInputStream fin=new FileInputStream("C:/Users/lenovo/Desktop/javacode/Herbert/july20/one.txt");
			 
			 int i=fin.read();
			 
			 System.out.println((char)i);
			 i=fin.read();
			 
			 
			 
			 System.out.println((char)i);
			 i=fin.read();
			 System.out.println((char)i);
			 i=fin.read();
			 System.out.println((char)i);
			 System.out.println(fin.available());
			 
			 fin.close();
			       }
			catch(Exception e) 
			{
			System.out.println(e);
			}
			                                      }
								}