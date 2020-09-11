import java.io.*;//import all classes from java.io package

class BufferReader {
public static void main(String args[]) throws IOException
{
char c;/*BufferedReader is use to read from buffer and InputStreamReader is use
  for conversion of bytestream to character stream here System.in is passes as object of InputStream*/
 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 System.out.println("Enter characters ,'q' to quit");
 do{
 c=(char)br.read();
 System.out.println(c);
 }while(c!='q');
   }
      }