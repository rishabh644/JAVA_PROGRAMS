class BoxOperation{

 public static void main(String args[])
 {
  Box b1=new Box();
  Box b2;//reference
  
  System.out.println("Volume of box b1 is "+b1.l*b1.w*b1.h);
  b2=b1;//not copy pointing to same thing
  
  System.out.println("Volume of box b1 is "+b1.l*b1.w*b1.h);
       }



}