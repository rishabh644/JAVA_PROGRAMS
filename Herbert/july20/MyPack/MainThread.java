

class NewThread implements Runnable {
 Thread t;
 NewThread() {
 // Create a new , second thread
 t=new Thread(this,"Child Thread");
 System.out.println("Child thread: "+t);
 t.start(); // Start the thread  
              }

public void run() {
  try {
  for(int i=5;i>0;i--) {
   System.out.println("Child Thread: "+i);
   Thread.sleep(400);
                       }
		}
	catch(InterruptedException e) {
	System.out.println("Child interrupted.");
	                              }
	System.out.println("Exiting child thread.");
	              }
				  
				                        }
class MainThread {
 public static void main(String args[])  {
  new NewThread();
  Thread t=Thread.currentThread();
         t.setName("Main Thread");
  System.out.println("Main Thread "+t);
   try {
   for(int i=5;i>0;i--) {
    System.out.println(" Main Thread: "+i);
	Thread.sleep(500);
	                    }
		}
	catch(InterruptedException e){
	System.out.println("InterruptedException "+e);
	                              }
	System.out.println("Exiting main thread");						            
                                              	}
					}
 
 