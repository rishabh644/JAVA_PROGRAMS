import java.io.*;

class ShowFile{
public static void main(String args[])
{
   int i;
   FileInputStream fin;//to read from file one of the subclass of input stream
   fin=null;
   if(args.length!=1){
   System.out.println("Usage:ShowFile filename");
   return;
   }
   //Attempt to open file.
   try{
   fin=new FileInputStream(args[0]);
   
  
  do{
  i=fin.read();//return ascii value of character
  if(i!=-1)System.out.print((char)i);
  }while(i!=-1);
 } 
 catch(FileNotFoundException e){
  System.out.println("Cannot Open File");//system.out is an object of printstream
   }

   catch(IOException e){
  System.out.println("Error Reading File");
     }
	 
  finally
   {try{
	  if(fin!=null)
	 fin.close();
       }
	  catch(IOException e)
	   {
	   System.out.println("Error while closing file");}
	   
	}
      } 
}  
   