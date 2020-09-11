class Thread1 extends Thread {
public void run(){
try{
System.out.println("First thread strats running");
sleep(10000);
System.out.println("First thread finishes running");
}
catch(Exception e){}
}
}
class Thread2 extends Thread{
public void run(){
try{
System.out.println("Second thread starts running");
System.out.println("Second thread is suspended itself");
suspend();
System.out.println("Second thread runs again");
}
catch(Exception e){}
}
}
class Demonstration_116{
public static void main(String [] args){
try{
Thread1 first=new Thread1();
Thread2 second=new Thread2();
first.start(); /*first is scheduled for running*/
second.start();/*second is scheduled for running*/
System.out.println("Revive the second thread ");
second.resume();
System.out.println("Wake up second thread and finishes running");
second.resume();
second.resume();
second.sleep(10000);
}
catch(Exception e){}
}
}
