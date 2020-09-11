package myshapes;

public class Ellipse extends Geometry{
double a,b;
public Ellipse()
{a=b=0;
}
public Ellipse(double a,double b)
{
this.a=a;
this.b=b;
}
public double area(){
return PI*a*b;
}
public double circumference(){
return PI*(a+b);
}
public double majorAxis()
{return a;
}
public double minorAxis()
{
return b;
}
}