
//incorrect way to implements producer consumer
 class Q {
  int n;
  
  synchronized int get() {
  System.out.println("Gotten : "+n);
  return n;              }
  
  synchronized void put(int n) {
  this.n=n;
  System.out.println("Putted : "+n);
                              }
			}
			
  class Producer implements Runnable {
  Q q;
  int i;
  Thread t;
  Producer(Q q) {
  this.q=q;
  t=new Thread(this,"Producer");
  t.start();
  this.i=0;
                }
  public void run() {
  //int i=0;
  while(i<20) {
  q.put(i++);
               }
			         }
					                  }
									  
 class Consumer implements Runnable {
 Q q;
 //Producer pb;
 Consumer(Q q) {
 this.q=q;
// pb=pob;
 new Thread(this,"Consumer").start();
                            }
				
 public void run() {
	 int i=0;
   while(i<20) {
   q.get();
   i++;            }  
			         }
					                }

 class PC {
 public static void main(String g[]) {
 Q q=new Q();
new Producer(q);
 new Consumer(q);
 
 System.out.println("Press Control-C to stop");
                                     }
		   }
     