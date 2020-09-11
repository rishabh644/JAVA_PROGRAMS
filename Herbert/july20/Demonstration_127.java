

// writing a byte into file

import java.io.*;

 class Demonstration_127 {
 
              public static void main(String ar[]) {
			  byte cities[]={'D','E','L','H','I',' ','M','A','D','R','A','S'};
			  FileOutputStream outfile=null;
			  
			  try {
			  outfile=new FileOutputStream("C:/Users/lenovo/Desktop/javacode/Herbert/july20/city.txt");
			  outfile.write(cities);
			  outfile.close();
			      }
			  catch(IOException ioe) {
			    System.out.println(ioe);
				                     }
						                            }
					      }