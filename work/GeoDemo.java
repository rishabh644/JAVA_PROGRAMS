import myshapes.*;
public class GeoDemo{
public static void main(String args[])
{
Geometry [] geoObjects=new Geometry[3];
geoObjects[0]=new  Circle(2.0);
geoObjects[1]=new Rectangle(4.0,5.0);
geoObjects[2]=new Ellipse(6.0,3.0);
double totalArea=0;
for(int i=0;i<3;i++) {
totalArea=totalArea+geoObjects[i].area();
}
System.out.println(" Area occupied by circle  ="+geoObjects[0].area());
System.out.println(" Area occupied by rectangle  ="+geoObjects[1].area());
System.out.println(" Area occupied by Ellipse  ="+geoObjects[2].area());
System.out.println("Total area occupied by shapes  ="+totalArea);
}
 }