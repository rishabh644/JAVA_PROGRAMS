class ThrowDemo1{
public static void main(String []args)
{ Thread t=Thread.currentThread();
  t.setPriority(10);
 new NewThread1("one",3);/*main thread priority is 5 so it is first thread
to excuted mind it*/
  new NewThread1("two",6);
  new NewThread1("three",9);
  
try{
for(int i=5;i>0;i--)
{
  System.out.println("Main Thread: "+i);
  Thread.sleep(1200);
    }
  }
  catch(InterruptedException e)
  {
   System.out.println("Main thread interrupted.");
      }
	System.out.println("Main thread exiting");
	
	 }
	    }
	
