class Super {
public static void main(String args[])
{

Box mybox1= new Box(10,20,15);
BoxWeight mybox2=new BoxWeight(2,3,4,0.076);
double vol;
vol=mybox1.volume();
System.out.println("Volume of mybox1 is "+vol);

vol=mybox2.volume();
System.out.println("Volume of mybox2 is "+vol);
System.out.println("Density of mybox2 is "+mybox2.density());
}


}