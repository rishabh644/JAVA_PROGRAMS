class ThreadA extends Thread{
public void run(){
for(int i=1;i<=5;i++){
System.out.println("From ThreadA with i= "+-1*i);
}
System.out.println("Exiting from ThreadA...");
}
}