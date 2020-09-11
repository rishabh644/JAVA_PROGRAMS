
// java FileOutPutStream : Write a byte into a file

import java.io.FileOutputStream;

public class Demonstration_126 {

  public static void main(String ar[]) {
  
       try {
	   FileOutputStream fout =new FileOutputStream("C:/Users/lenovo/Desktop/javacode/Herbert/july20/two.txt");
	   fout.write(65);
	   fout.write(78);
	   fout.write(312);
	   fout.write(-2);
	   fout.write(114);
	   fout.write(105);
	   fout.write(115);
	   fout.write(104);
	   fout.write(97);
	   fout.write(98);
	   fout.write(104);
	   fout.close();
	   System.out.println("File write is over.....");
	       }
		catch(Exception e) {
			System.out.println(e);
		                    }
                                              }
                                    }