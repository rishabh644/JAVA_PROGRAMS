
// My Knowledge Test Program

import java.io.*;


class MyTest {

 public static void main(String ar[]) {
  try{	
	FileReader obj=new FileReader("C:/Users/lenovo/Desktop/javacode/Herbert/july20/one.txt");
	FileWriter obj1=new FileWriter("C:/Users/lenovo/Desktop/javacode/Herbert/july20/seven.txt");
	 int i=obj.read();
	 System.out.println((char)i);
	 i=obj.read();
	 System.out.println((char)i);
	 i=obj.read();
	 System.out.println((char)i);
	 i=obj.read();
	 System.out.println((char)i);
	 obj.close();
	 obj1.write(312);
	 obj1.write(344);
	 obj1.write(553);
	 obj1.write(258);
	 obj1.close();
   }
   catch(Exception e) {
	   System.out.println(e);
      }
                                        }



              }