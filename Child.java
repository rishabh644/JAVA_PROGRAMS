import java.util.Scanner;

class Child extends Parent{
void msdhoni(){
System.out.println("Dhoni with his child lives in Mumbai");
}
public static void main(String args[])
{
Parent obj=new Parent();
obj.msdhoni();
Parent obj1=new Child();
obj1.msdhoni();
}
}