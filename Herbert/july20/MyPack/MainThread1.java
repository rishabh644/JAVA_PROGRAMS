
class ChildThread1 extends Thread {

 ChildThread1() {
   System.out.println("Inside childthread");
   start();
                }
public void run() {
 try {
       for(int i=5;i>0;i--) {
                               System.out.println(" ChildThread1 "+i);
                                Thread.sleep(500);
							}
	  }
 catch(InterruptedException e) {
                                 System.out.println("Exception in ChildThread1 "+e);
                               }
 System.out.println("Exiting ChildThread1");
 
                    }
					                }
									 
class MainThread1 {

 public static void main(String g[]) {
 
                    new ChildThread1();
					try {
					           for(int i=5;i>0;i--) {
							                          System.out.println("MainThread1 "+i);
													  Thread.sleep(1000);
													 }
				         }
					catch(InterruptedException e) {
					                            System.out.println("Exception in MainThread1 "+e);
												  }
					System.out.println("Exiting MainThread1 ");
				                        }
					
					}
 
 
 
  
							     
		
                            								
 