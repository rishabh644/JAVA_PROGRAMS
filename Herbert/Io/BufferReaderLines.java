import java.io.*;//import all classes from java.io package

class BufferReaderLines {
public static void main(String args[]) throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String str;
System.out.println("Enter lines of text");
System.out.println("Enter 'stop' to quit.");
do{
str=br.readLine();
System.out.println(str);
   }while(!str.equals("stop"));
   
   }
     }