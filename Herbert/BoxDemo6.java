class BoxDemo6 {
public static void main(String args[]){
 Box mybox1=new Box();
 Box mybox2=mybox1;
 double vol=mybox1.volume();
 System.out.println("Volume of box1 is "+vol);
 mybox2.length=0;
 System.out.println("Volume of box1 is "+mybox1.volume());
   }
  } 