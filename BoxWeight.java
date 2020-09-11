class BoxWeight extends Box
{
double weight;

BoxWeight()
{
super();
weight=0.0;
}

BoxWeight(double w,double h,double d,double m)
{
super(w,h,d);
weight=m;

}
double density()
{
	return(weight/volume());
}

}
