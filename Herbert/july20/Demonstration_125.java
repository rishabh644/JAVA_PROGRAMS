
import java.io.FileInputStream; 

public class Demonstration_125 {

            public static void main(String ar[]) {
			 try {
			 FileInputStream fin=new FileInputStream("C:/Users/lenovo/Desktop/javacode/Herbert/july20/one.txt");
			 
			 int i=0;
			 
			 while((i=fin.read())!=-1) {
			 
			 System.out.print((char)i );
			                          }
			 fin.close();
			       
				   }
			catch(Exception e) 
			{
			System.out.println(e);
			}
			                                      }
								}