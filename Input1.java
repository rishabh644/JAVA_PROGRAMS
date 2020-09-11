import java.util.Scanner;
class Input1
{
public static void main(String args[])
{
Scanner obj=new Scanner( System.in);
System.out.println("Please enter two intwger");
int a=obj.nextInt();
int b=obj.nextInt();
if(a>b)
{
System.out.println("a is greater than b");
}
else{
System.out.println("b is greater than a");
}
System.out.println("Enter radius of circle");
double r=obj.nextDouble();
System.out.println("Area is "+3.14*r*r);
}
}