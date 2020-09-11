public class DataRace extends Thread{
 static int x=0;
public void run(){
for(int i=0;i<100000;i++)
{x=x+1;
x=x-1;
}
 }
public static void main(String [] args){
for(int i=0;i<100;i++){
new DataRace().start();
System.out.println(x);
}
}
}