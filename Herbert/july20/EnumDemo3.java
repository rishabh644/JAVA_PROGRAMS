
// Demonstrate ordinal() , compareTo() , and equals()

 enum Apple3 {
 Jonathan ,GoldenDel ,RedDel, Winesap ,Cortland 
 }
 
 class EnumDemo3 {
  
   public static void main(String args[]) {
   Apple3 ap,ap2,ap3;
   System.out.println("Here are all apple constants with their ordinal value");
   System.out.println("Variety--------------------OValues");
   for(Apple3 a:Apple3.values()) {
   System.out.println(a+"                         "+a.ordinal());
                            }
   ap=Apple3.Jonathan;
   ap2=Apple3.Cortland;
   ap3=Apple3.RedDel;
   System.out.println();
   
   if(ap.compareTo(ap2)<0)
        System.out.println("ap comes before ap2");
   if(ap2.compareTo(ap3)>0)
        System.out.println("ap2 comes after ap3");
   if(ap3.compareTo(ap)>0)
        System.out.println("ap3 comes after ap");
   if(ap.equals(ap2))
      System.out.println("ap equals to ap2");
   else
      System.out.println("ap is not equals to ap2");
    ap3=Apple3.Cortland;
    if(ap3==ap2)
      System.out.println("ap3 is equals to ap2");
                                                }
                    }												