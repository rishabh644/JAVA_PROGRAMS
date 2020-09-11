class ThrowDemo{
public static void main(String []args)
{  new NewThread();/*main thread priority is 5 so it is first thread
to excuted mind it*/
try{
for(int i=5;i>0;i--)
{
  System.out.println("Main Thread: "+i);
  Thread.sleep(1000);
    }
  }
  catch(InterruptedException e)
  {
   System.out.println("Main thread interrupted.");
      }
	System.out.println("Main thread existing");
	
	 }
	    }
	
