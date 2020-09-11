import java.io.File;
import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.FileReader;
class FileTest {
public static void display(File obj){
long size; 
try{
size=obj.length();//available will return total size allocated to file
System.out.println("Total bytes::"+ size);
System.out.println("First 1/4 is displayed:using read()");
for(long i=0;i<size/4;i++){
	System.out.println( (char)obj.read( ));
}
 }
 catch(Exception e){
 }
 }



public static void getPaths(File f) {
try{
	System.out.println("Name: "+f.getName());//printing name of file
System.out.println("Path: "+f.getPath());//printing name of path
System.out.println("Parent: "+f.getParent());
}
catch(Exception e){
}
  }// reference of file in f
public static void getInfo(File f){
try{
	if(f.exists())//check if file exist
	{
System.out.print("File exists ");
System.out.println(f.canRead()?"and is readable":"");
System.out.println(f.canWrite()?"and is writeable":"");
System.out.println("File is last modified :"+f.lastModified());
System.out.println("File is"+f.length()+"bytes");
     }
else
System.err.println("File does not exist.");
   } 
   catch(Exception e){
   }

}
public static void main(String [] args) 
{
File fileToCheck;
int size;
try{//args contion name of file as string
if(args.length>0){
for(int i=0;i<args.length;i++){
fileToCheck=new File(args[i]);
getPaths(fileToCheck);//passing reference of file name
getInfo(fileToCheck);//passing reference of file name
  
display(fileToCheck);  
}
}
else
 System.out.println("Usage : Java file test<filename");
 
 } catch(Exception e){
        }

 
         }
 
 }