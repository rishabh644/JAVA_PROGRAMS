abstract class Base{
void fun(){
System.out.println("Base fun() is called"); }
}

class Derived extends Base {
Derived(){
System.out.println("Derived constructor is called");
}

void fun()
{
super.fun();
System.out.println("Derived fun() is called");
}

}

class Demonstration_610{
public static void main(String args[])
{Base b;
Derived d=new Derived();
b=d;
b.fun();
}
 }