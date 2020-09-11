class ThrowDemo1{
	static void throwOne() throws IllegalAccessException {
System.out.println("Inside throwone");
throw new IllegalAccessException("demo");
                         }
public static void main (String []args)
{   System.out.println("Hare Krishna");
	try{
         throwOne();
              }

      catch(IllegalAccessException e)
      {
         System.out.println(e);
              }

     }
	 
  }