class ThrowDemo{

  static void demoproc() throws NullPointerException {
  try{
    throw new NullPointerException("demo");
      }
	catch(NullPointerException e)
	{
	  System.out.println("caught inside demoproc");
	  throw e;//rethrow the exception
	  }
	}
public static void main(String [] args)
{try{
demoproc(); }
catch(NullPointerException e){
System.out.println("Recaught: "+e);
     }
  
   }
 }
 