abstract class Base {
abstract void fun();
void wheather(){
System.out.println("The wheather is pleasent outside");
}
}

class Derived1 extends Base{
void fun(){System.out.println("Derived1 fun() is called");
}
 }
 class Demonstration_68{
 public static void main(String args[])
 {
  Base b=new Derived1();
  b.fun();
  b.wheather();
  }
   }