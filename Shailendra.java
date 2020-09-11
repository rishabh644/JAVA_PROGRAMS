import java.util.Scanner;


class Shailendra extends  Rishabh1{
	Scanner sc=new Scanner(System.in);
void input()
{
System.out.println("Enter two number\n");
a=sc.nextInt();
b=sc.nextInt();
}
void add()
{
s=a+b;
}

void result()
{
System.out.printf("The sum of two number is %d\n",s);
}
public static void main(String args[])
{
 Shailendra obj=new Shailendra();
obj.input();
obj.add();
obj.result();
obj.checking();
}
}
