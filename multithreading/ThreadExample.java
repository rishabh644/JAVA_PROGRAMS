public class ThreadExample extends Thread {
public void run(){
for(int i=0;i<3;i++) {
try{
	System.out.println("Their is pimple on my face");
sleep((int)(Math.random()*5000));
System.out.println("Their is pock on my face");
}
catch(InterruptedException e){
System.out.println(e);
}


}
}
public static void main(String [] args) {
new ThreadExample().start();
new ThreadExample().start();
System.out.println("Done");
}
}