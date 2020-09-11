class Box1{
double w,l,h;

double area()
{
return 2*(w*l+l*h+w*h);
}


double volume()
{
return w*l*h;
}


 Box1(double l,double b,double hh)
{
this.w=l;
this.l=b;
this.h=hh;
System.out.println("Inside Box1 parametarized constructor");
}

Box1()
{ 
	w=l=h=3;
	System.out.println("Inside class Box1 constructor ");
}


}

class BoxWeight1 extends Box1
{
double weight;

BoxWeight1()
{
super();
System.out.println("inside class Boxweight1 constructor");
weight=0.0;
}

BoxWeight1(double w,double h,double d,double m)
{
super(w,h,d);
weight=m;
System.out.println("Inside BoxWeight1 parametarized constructor");

}
double density()
{
	return(weight/volume());
}

}
class Shipment extends BoxWeight1 {
double cost;
Shipment(double w,double h,double d,double m,double c){
super(w,h,d,m);
cost=c;
}
   }
class Demonstration_67 {
public static void main(String args[])
{

/*Box1 mybox1= new Box1(10,20,15);
BoxWeight1 mybox2=new BoxWeight1(2,3,4,0.076);
Shipment mybox3=new Shipment(10,10,10,5,500);
double vol;
vol=mybox1.volume();
System.out.println("Volume of mybox1 is "+vol);

vol=mybox2.volume();
System.out.println("Volume of mybox2 is "+vol);
System.out.println("Density of mybox2 is "+mybox2.density());
System.out.println("Cost of mybox3 is "+mybox3.cost);
System.out.println("volume of mybox3 is "+mybox3.volume());
System.out.println("weight of mybox3 is "+mybox3.weight);
System.out.println("Density of mybox3 is "+mybox3.density());
System.out.println("Area of mybox3 is "+mybox3.area());
*/
BoxWeight1 obj=new BoxWeight1(6,8,6,6);

}


}
