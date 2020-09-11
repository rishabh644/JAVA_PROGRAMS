class Multi{
public static void main(String [] args)
{
	//System.out.println("Diwali has end and i am ill");
ThreadA a=new ThreadA();

ThreadB b=new ThreadB();

ThreadC c=new ThreadC();

a.start();
//System.out.println("Diwali has end and i am ill");
b.start();
//System.out.println("Diwali has end and i am ill");
c.start();
System.out.println("I am lying on bad");
}
}