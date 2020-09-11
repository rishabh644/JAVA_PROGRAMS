class ThreadC extends Thread{
public void run(){
for(int i=1;i<=5;i++){
System.out.println("From ThreadC with i= "+(2*i-1));
}
System.out.println("Exiting from ThreadC...");
}
}