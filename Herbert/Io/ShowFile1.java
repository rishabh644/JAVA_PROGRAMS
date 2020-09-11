import java.io.*;

class ShowFile1{
public static void main(String args[])
{
   int i;
   FileInputStream fin;//to read from file one of the subclass of input stream
   if(args.length!=1){
   System.out.println("Usage:ShowFile filename");
   return;
   }
   //Attempt to open file.
   try{
   fin=new FileInputStream(args[0]);
   }catch(FileNotFoundException e){
   System.out.println("Cannot Open File");//system.out is an object of printstream
   return;
  }
  try{
  do{
  i=fin.read();//return ascii value of character
  if(i!=-1)System.out.print((char)i);
  }while(i!=-1);
 } catch(IOException e){
  System.out.println("Error Reading File");
     }
	 try{
	 fin.close();
       }catch(IOException e)
	   {
	   System.out.println("Error while closing file");}
	   }
	   
}  
   