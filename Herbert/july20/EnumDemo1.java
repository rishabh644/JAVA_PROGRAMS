  
   // Use the bult-in enumeration methods
   
   
    // An enumeration of apple varieties.
 enum Apple1 {
 // all enum constants of type type Apple1 are automatically public static and final
  Jonathan , GoldenDel , RedDel , Winesap, Cortland
             }
			 
  class EnumDemo1 {
  
   public static void main(String []r) {
   
    Apple1 ap;
	System.out.println("Here are all values of Apple1");
	Apple1 allapples[]=Apple1.values();
	for(Apple1 a:allapples) {
		System.out.println(a);
	                          }
	System.out.println();
	
	System.out.println("See the allvalues in a diferrent way");
	
	for(Apple1 a:Apple1.values()) {
		System.out.println(a);
	                               }
	
	
	
	
	
	
	ap=Apple1.valueOf("Winesap");
	System.out.println(" ap contains "+ap);
                                           }
                        }