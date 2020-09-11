class MethodOverridingTest{
  public static void main(String args[])
   {
   Point2D p=new Point2D(3,4);
   p.display();//Refers to the method in Point2D
   Point3D q=new Point3D(99);
   q.display();//Refers to the method in Point3D
   
   Point2D x=(Point2D) q;//Cast q to an instance of class Point2D
   x.display();
   
   
  }
}