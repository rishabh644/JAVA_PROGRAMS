
//correct way to implements producer consumer but deadlock
 class Queue {
  int n;
  boolean valueSet=false;
  
  synchronized int get() {
  
  while(valueSet) {
     try {
	 wait();
	     }
	 catch(InterruptedException e) {
	 System.out.println("InterruptedException Caught");
	                                }
	System.out.println("Got: "+n);
	
	valueSet=false;
	notify();
	
	               }
				   return n;
				           }
				
  
  
  
  
  
  synchronized void put(int n) {
  
    while(!valueSet) {
	  try {
	     wait();
		  }
	  catch(InterruptedException e) {
	   System.out.println("InterruptedException caught "+e);
	                                 }
	  this.n=n;
	  valueSet=true;
	  System.out.println("put : "+n);
	  notify();
			        }             }
		}
			
  class Producer1 implements Runnable {
  Queue q;
  
  Thread t;
  Producer1(Queue q) {
  this.q=q;
  t=new Thread(this,"Producer");
  t.start();
  
                       }
  public void run() {
  int i=0;
  while(true) {
  q.put(i++);
               }
			         }
					                  }
									  
 class Consumer1 implements Runnable {
 Queue q;
 
 Consumer1(Queue q) {
 this.q=q;

 new Thread(this,"Consumer").start();
                    }
				
 public void run() {
	 
   while(true) {
   q.get();
               }  
			         }
					                }

 class ProducerConsumer1 {
 public static void main(String g[]) {
 Queue q=new Queue();
new Producer1(q);
 new Consumer1(q);
 
 System.out.println("Press Control-C to stop");
                                     }
		                 }
     