import java.util.Scanner;
class AreaOfCircle implements AreaCal
{
public double circlearea(double r)
{double area;

area=(22*r*r)/7;
return area;
}

public static void main(String args[])
{
AreaOfCircle x;
Scanner s=new Scanner(System.in);
System.out.println("Enter the radius of circle");
double rad=s.nextDouble();
x=new AreaOfCircle();
System.out.println("Area of circle is "+x.circlearea(rad));
}
}