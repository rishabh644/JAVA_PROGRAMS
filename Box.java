class Box{
double w,l,h;
double area()
{
return 2*(w*l+l*h+w*h);
}

double volume()
{
return w*l*h;
}

 Box(double l,double b,double hh)
{
this.w=l;
this.l=b;
this.h=hh;
}
Box()
{
	w=l=h=0;
}


}