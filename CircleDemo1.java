class CircleDemo1
{
public static void main(String args[])
{Circle c1,c2,c3,c4,c5,c6,c7;

Box b1;
c1=new Circle(2,3,4);
c2=new Circle(7);
c3=new Circle(c1);
c4=new Circle();
c5=c1.bigger(c2);
c6=Circle.bigger(c1,c2);
c7=new Circle();
b1=new Box(5,6,7);
c5.r=0;
System.out.println("Circumference :"+c1.circumference());
System.out.println("Area :"+c1.area());
System.out.println("CountDown "+c1.circlecount);
System.out.println("Circumference :"+c2.circumference());
System.out.println("Area :"+c2.area());
System.out.println("CountDown "+c2.circlecount);
System.out.println("Circumference :"+c3.circumference());
System.out.println("Area :"+c3.area());
System.out.println("CountDown "+c3.circlecount);
System.out.println("Circumference :"+c4.circumference());
System.out.println("Area :"+c4.area());
System.out.println("CountDown "+c4.circlecount);
System.out.println("Circumference :"+c5.circumference());
System.out.println("Area :"+c5.area());
System.out.println("CountDown "+c5.circlecount);
System.out.println("Circumference :"+c5.circumference());
System.out.println("Area :"+c5.area());
System.out.println("CountDown "+c5.circlecount);
System.out.println("countdown "+c7.circlecount);
System.out.println("Box Area :"+b1.area());
System.out.println("Box Volume :"+b1.volume());



}
}