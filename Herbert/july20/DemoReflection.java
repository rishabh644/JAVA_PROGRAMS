
// A simple java program to demonstrate the use of reflection

import java.lang.reflect.Method;
import java.lang.reflect.Field;
import java.lang.reflect.Constructor;

// class whose object is to be created

class Test
{
      private String s;
	  
	  public Test() { s="GeeksforGeeks";}
	  
	  public void method1() {
	  System.out.println("The string is "+s);
	                  }
	  public void method2(int n) {
	  System.out.println("The number is "+n);
	                            }
	  private void method3() {
	   System.out.println("Private method invoked");
	                     }

}

class DemoReflection
{

   public static void main(String [] g) throws Exception
   {
     // Creating object whose property is to be checked
   Test obj=new Test();
   //Creting class object from the object 
   // getclass method
   Class cls=obj.getClass();
   System.out.println("The name of class is "+cls.getName());
   Constructor constructor=cls.getConstructor();
   System.out.println("The name of constructor is "+constructor.getName());
   System.out.println("The public methods of class are: ");
   
   // Getting methods of the class through the object
   // of the class by using getmethods
   
   Method[] methods=cls.getMethods();
   for(Method method:methods)
	   System.out.println(method.getName());
   // creates object of desired method by providing the
   // method name and parameter class as arguments to
   // the getDeclaredMethod
   Method methodcall1=cls.getDeclaredMethod("method2",int.class);
   
   // invokes the method at runtime
   
   methodcall1.invoke(obj,19);
   // creates object of the desired field by providing
   // the name of field as argument to the 
   // getDeclaredField method
   Field field=cls.getDeclaredField("s");
   
   // allows the object to access the field irrespective 
   // of the access specifier used with field
   field.setAccessible(true);
   // takes object and the new value to be assigned
   // to the field 
   
   field.set(obj,"JAVA");
   
   //Creates object of desired method by providing the
   // method name as argument to the getDeclaredMethod
   
   Method methodcall2 =cls.getDeclaredMethod("method1");
   // invokes the method at runtime
   methodcall2.invoke(obj);
   // Creates object of the desired method by providing
   // the name of method as argument to the
   // getDeclaredMethod method
   
   Method methodcall3=cls.getDeclaredMethod("method3");
   
   // allows the object to access the method irrespective
   // of the access specifier used with the method
   methodcall3.setAccessible(true);
   methodcall3.invoke(obj);
   
   
   }
   
}
   
   
   
   
