class AccessTest {
public static void main(String [] args)
{
Test2 ob=new Test2();
ob.a=10;
ob.b=12;

ob.setc(13);
System.out.println("a,b, and c: "+ob.a+" "+ob.b+" "+ob.getc());
 }
}
