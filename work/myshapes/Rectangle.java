package myshapes;

public class Rectangle extends Geometry{
public double l,b;
public Rectangle(){
l=0;
b=0;
}
public Rectangle(double l,double b)
{
this.l=l;
this.b=b;
}
public double area()
{
return l*b;
}
public double circumference()
{
return 2*(l+b);
}

public double getLength()
{
return l;
}
public double getBreadth()
{
return b;
}
}