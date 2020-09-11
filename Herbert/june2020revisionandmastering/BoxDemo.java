
class Box{
double width;
double height;
double depth;
Box(){
	System.out.print(" Default constructor of Box is executed ");
}
Box(double w,double h,double d){
width=w;
height=h;
depth=d;
}
double volume(){
	return width*height*depth;
   }

}

class BoxDemo {
	static int xx=90;
public static void main(String []args){
Box mybox=new Box();
Box mybox2=new Box(6,7,10);

System.out.println(" Width "+mybox.width+" Height "+mybox.height+" Depth "+mybox.depth);
mybox.width=2;
mybox.height=4;
mybox.depth=3;
double vlm=mybox.width*mybox.height*mybox.depth;
System.out.println(" Mybox Volume "+vlm);
vlm=mybox2.volume();
System.out.println(" Mybox2 Volume "+vlm);
System.out.println(" xx "+xx);
                                      }
				}