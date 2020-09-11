class Box11{
double width;
double height;
double depth;

Box11(Box11 ob)
{
width=ob.width;
height=ob.height;
depth=ob.depth;
}
Box11(double w,double h,double d)
{
	width=w;
	height=h;
	depth=d;
}
Box11(){
	width=-1;
	height=-1;
	depth=-1;
}
Box11(double len){
width=height=depth=len;}
double volume()
{
return width*height*depth;
}
}