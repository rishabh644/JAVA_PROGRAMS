
 enum Apple2 {
 Jonathan(10), GoldenDel(9), RedDel(12) , Winesap(15) , Cortland(8);
 
 
 Apple2(int p) {price=p;}
 private int price;
 int getPrice() { return price;}
   
             }
			 
 class EnumDemo2 {
 
   public static void main(String args[])
   {
    Apple2 ap;
	int ris=90;
	 System.out.println("Value or ris "+ris);
	 System.out.println("Winesap costs "+Apple2.Winesap.getPrice());
	 System.out.println("See the name of all varieties of Apple with their price ");
	 System.out.println();
	 System.out.println();
	 System.out.println("Variety----------------------Price");
	 for(Apple2 r:Apple2.values()) {
	 System.out.println(r+"                            "+r.getPrice());
	                                }
		
									
	}
	               }