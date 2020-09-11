class Circle
{static int circlecount=0;//class variables
double x,y;// instance variables
double r;//instance variable
double circumference(){
return 2*3.14*r;
}
double area()
{ return (22/7)*r*r;
}
Circle(double x,double y,double r)
{
	this.x=x;
	this.y=y;
	this.r=r;
	circlecount++;
}
Circle(double r)
{
	x=0;y=0;this.r=r;
	circlecount++;
}
Circle(Circle ob)
{
	x=ob.x;
	y=ob.y;
	r=ob.r;
circlecount++;
}
Circle()
{
x=y=r=0;
circlecount++;}
Circle bigger(Circle obj)
{
	if(obj.r>r)
		return obj;
	else 
		return this;
	
}

static Circle bigger(Circle a,Circle b)
{
	if(a.r>b.r)
	return a;
else 
	return b;
}
public static class Point{
	double x,y;
	void display()
	{
		System.out.println("(x,y):("+this.x+","+this.y+")");
	}
	Point(double a,double b)
	{
		this.x=a;
		this.y=b;
	}
}
boolean isInside(Point p)
{
	double dx=p.x-x;
	double dy=p.y-y;
	double distance=Math.sqrt((dx*dx)+(dy*dy));
	if(distance<r)return true;
	else return false;
}
public static void main(String args[])
{
	Point pa,pb;
	Circle a,b;
	a=new Circle(2.0);
pa=new Point(1.0,1.0);
pa.display();
System.out.println("Is the point(1,1) inside the circle with radius 2"+a.isInside(pa));
 b=new Circle(1.0);
pb=new Point(3.0,3.0);
System.out.println("Is the point(3,3) inside the circle with radius 3"+b.isInside(pb));
}

}