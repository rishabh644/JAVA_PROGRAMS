class ThreadB extends Thread{
public void run(){
for(int i=1;i<=5;i++){
System.out.println("From ThreadB with i= "+2*i);
}
System.out.println("Exiting from ThreadB...");
}
}