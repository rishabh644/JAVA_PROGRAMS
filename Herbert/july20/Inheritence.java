

class A {
void Notepad(){

  System.out.println(" Notepad is used for writing ");

}
 protected void Lockdown(){
 System.out.println("Lockdown has changed the life style of people");
 }	 
   }
class B extends A{
 void Notepad1() {
 System.out.println(" All Notepad is used for writing ");
 }
public void Lockdown(){
System.out.println("Lockdown has changed the way of learning");
}

  }
  
class Inheritence {

 public static void main(String args[]) {
 
 A obj=new B();
 B objb=new B();
 A obja=new A();
 obja.Notepad();
 objb.Notepad1();
 obj.Lockdown();
 obj.Notepad();
 
  }
  
            }