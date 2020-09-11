

class FindAreas {

public static void main(String [] args)
 {
 
  // Figure f=new Figure(10,23);
   Rectangle r=new Rectangle(12,5);
   Triangle t=new Triangle(12,2);
   
   Figure figref;
   
   figref=r;
   System.out.println(" Area is " + figref.area());
   figref=t;
   System.out.println(" Area is "+figref.area());
 /*  figref=f;
   System.out.println(" Area is "+figref.area());*/
   
}

                  }