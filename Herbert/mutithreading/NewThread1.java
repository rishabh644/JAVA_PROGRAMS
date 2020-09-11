class NewThread1 implements Runnable{
String name;
Thread t;
NewThread1(String threadname,int pr){
name=threadname;
t=new Thread(this,name);
System.out.println(name);
t.setPriority(pr);
t.start();
    }
 public void run(){
 try{
 for(int i=5;i>0;i--){
   System.out.println(name+" : "+i);
   Thread.sleep(400);
           }
		}catch(InterruptedException e){
	System.out.println(name+ " interrupted.");
	}

System.out.println(name+" Exiting");
}
     }