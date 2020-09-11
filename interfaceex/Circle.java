interface GeoAnalyzer{
final static float pi=3.14F;
float area();
float perimeter();
}
class Circle implements GeoAnalyzer{
float radius;
Circle(float r){
radius=r;
}
public float area(){
return (pi*radius*radius);
}
public float perimeter(){
return(2*pi*radius);
}
public float getRadius()
{
return radius;
}
}