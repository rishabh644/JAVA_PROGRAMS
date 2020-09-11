

class NewThreadMulti extends Thread {

// Thread t;
 String name;
 NewThreadMulti(String msg,int p) {
 name=msg;
 
 //t=new Thread(this,name);
 System.out.println("Child thread: "+name);
 //t.
  setPriority(p);
 start(); // Start the thread  
 //setPriority(p);                          
                                   }

public void run() {
  try {
  for(int i=5;i>0;i--) {
   System.out.println(name+" "+i);
   Thread.sleep(400);
                       }
		}
	catch(InterruptedException e) {
	System.out.println("Child interrupted.");
	                              }
	System.out.println("Exiting "+name);
	              }
				  
				                        }
class MainThreadMulti {
 public static void main(String args[])  {
 NewThreadMulti ch1=new NewThreadMulti("child1",2);
 NewThreadMulti ch2=new NewThreadMulti("child2",4);
 NewThreadMulti ch3=new NewThreadMulti("child3",9);
       
  System.out.println("child1 isAlive "+ch1.isAlive());
  System.out.println("child2 isAlive "+ch2.isAlive());
  System.out.println("child3 isAlive "+ch3.isAlive());
  
  System.out.println("Waiting for child threads to terminate");
  
   try {
	   ch1.join();
	   ch2.join();
	   ch3.join();
       }
  catch(InterruptedException e) {
 System.out.println("InterruptedException due to join" +e);
                                 }
						
 
  
  
  Thread t=Thread.currentThread();
         t.setName("Main Thread");
  System.out.println(" Starting Main Thread "+t);
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
 
 