class Point3D extends Point2D
{
int z;
public Point3D(int a,int b,int c){
	super.Point2D(a,b);
z=c;}
void display(){
 System.out.println("x= "+x+"y= "+y+"z= "+z);
 }
}