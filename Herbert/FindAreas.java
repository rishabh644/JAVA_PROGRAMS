// using run-time polymorphism
class Figure{
double dim1;
double dim2;
Figure(double a,double b)
{
dim1=a;
dim2=b;
}
double area(){
System.out.println("Area for Figure is undefined");
return 0;
   }
}
class Rectangle extends Figure{
Rectangle(double a,double b)
{
super(a,b);
}
double area(){
 System.out.println("Inside area for Rectangle.");
 return dim1*dim2;
  }
 }
 class Triangle extends Figure {
 Triangle(double a,double b)
 {
 super(a,b);
 }
 double area()
 {
 System.out.println("Inside area for Triangle");
 return dim1*dim2/2;
   }
  
  }
  class FindAreas{
  public static void main(String [] args)
  {
   Figure f=new Figure(10,10);
   Rectangle r=new Rectangle(9,5);
   Triangle t=new Triangle(5,6);22
   Figure figref;
   figref=r;
   System.out.println("Area is "+figref.area());
   figref=t;
   System.out.println("Area is "+figref.area());
   figref=f;
   System.out.println("Area is "+figref.area());
   
       }
 }