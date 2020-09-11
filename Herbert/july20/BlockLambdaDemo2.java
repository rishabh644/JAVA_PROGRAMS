

 // A block lambda that reverses th characters in a string.
 
 interface StringFunc {
 String func(String n);
                       }

 class BlockLambdaDemo2 {
 
  public static void main(String ar[]) {
    // This block lambda reverses the characters in a string
	
	StringFunc reverse=(st)-> {
	String rs="";
	int i;
	for(i=st.length()-1;i>=0;i--) {
	rs+=st.charAt(i);
	}
	 return rs;
							 
   							 };
							 
	System.out.println(" Lambda reversed is "+reverse.func("Lambda"));
	System.out.println(" Rishabh reversed is "+reverse.func("Rishabh"));
	System.out.println(" SantoshKumarPandey reversed is "+reverse.func("SantoshKumarPandey"));
                                             }
                          }
							   
							   
	              
    