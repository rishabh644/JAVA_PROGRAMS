
/* Copying a file into another file using CharacterStream Class */

 import java.io.*;
 
 class Demonstration_129 {
        public static void main(String ar[]) {
		// Declare and create input and output files
		File inFile=new File("C:/Users/lenovo/Desktop/javacode/Herbert/july20/ToDo.txt");
		File outFile=new File("C:/Users/lenovo/Desktop/javacode/Herbert/july20/ToDo1.txt");
		FileReader ins = null;
		FileWriter outs=null;
		
		try {
		      ins=new FileReader(inFile);
			  //Opens inFile
			  outs=new FileWriter(outFile);
			  //Opens outFile
			  int ch; // Read and write till the end
			  
			  while((ch=ins.read())!=-1) {
			               outs.write(ch);
						                   }
		    }
		catch(IOException e) {
		System.out.println(e);
		                      }
		finally {
		        try {
				            ins.close();
							outs.close();
					}
					catch(IOException e){}
				}
				                                      }
													  
							}
										
				