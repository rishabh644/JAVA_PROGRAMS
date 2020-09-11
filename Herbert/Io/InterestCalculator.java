import java.io.*;
class InterestCalculator
{
      public static void main(String args[])
	  {
	     Float principalAmount=new Float(0);//wrapper class
		 Float rateofInterest=new Float(0);//wrapper class
		 int numberofYears=0;//primitive type
		 DataInputStream in=new DataInputStream(System.in);
		 String tempString="rishabh";
		 System.out.print("Enter Principal Amount: ");
		 System.out.flush();
		 try{
		 tempString=in.readLine();//readLine read as string
		 }
		 catch(Exception e)
		 {
		 }
		 System.out.println(tempString);
		 principalAmount=Float.valueOf(tempString);//autounboxing+autoboxing
		 System.out.println("Enter Rate of Interest: ");
		 System.out.flush();//to remove everything from buffer
		 try{
		 tempString=in.readLine();//readLine read as string
		 }
		 catch(Exception e)
		 {
		 }
		 rateofInterest=Float.valueOf(tempString);
		 System.out.println("Enter Number of Years:");
		 System.out.flush();
		 try{
		 tempString=in.readLine();//readLine read as string
		 }
		 catch(Exception e)
		 {
		 }
		 numberofYears=Integer.parseInt(tempString);//autounboxing and autoboxing
		 float interestTotal=principalAmount*rateofInterest*numberofYears;
		 System.out.println("Total Interest= "+interestTotal);
	       }
	  
}
		 
		 