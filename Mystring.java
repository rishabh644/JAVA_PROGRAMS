class RevString{
String s=" ";
int i;
String reversestring(String ref)
{
for(i=ref.length()-1;i>=0;i--)
{
s=s+ref.charAt(i);
}
return s;
  }
        }
		
class Mystring{
public static void main(String [] arr)
{
RevString obj=new RevString();
String myobj=new String("Unity in diversity is our pride");
System.out.println("Original string: "+myobj);
myobj=obj.reversestring(myobj);
System.out.println("Reverse string: "+myobj);
}
}