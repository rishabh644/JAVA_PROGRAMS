import java.util.*;
import java.lang.*;
import java.math.*;
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner sc=new Scanner(System.in);
	int t=	10;
	//sc.nextLine();
	   while(t>0) {
	     String s=sc.nextLine();
		 BigInteger n=new BigInteger(s);
		 s=sc.nextLine();
		 BigInteger k=new BigInteger(s);
		 BigInteger r=n.subtract(k).divide(BigInteger.valueOf(2));
		 BigInteger a=r.add(k);
		 System.out.println(a+"\n"+r);
		 t--;
	   }
	   
	}
}