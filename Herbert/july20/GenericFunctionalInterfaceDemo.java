
 // Use a generic functional interface with lambda expressions.
 
 // A generic functional interface
 
 interface SomeFunc<T> {
 T func(T t);
                       }
					   
  class GenericFunctionalInterfaceDemo {
	  public static void main(String arg[]) {
		  // Use a String-based version of SomeFunc.
	  SomeFunc<String> reverse=(st)->{
		  String rs="";
		  int i;
		  
		  for(i=st.length()-1;i>=0;i--)
			  rs+=st.charAt(i);
		  return rs;
	                                 };
									 
	System.out.println(" Indian Air Force reversed is "+reverse.func("Indian Air Force"));
	
	// Now , use an Integer-based version of SomeFunc.
	
	SomeFunc<Integer> factorial =(n) -> {
		int result=1;
		 for(int i=1;i<=n;i++)
			 result*=i;
	    return result;                      
	                                     };
	System.out.println(" The factorial of 7 is "+factorial.func(7));
	System.out.println(" The factorial of 10 is "+factorial.func(10));
	
	                                               }
												   
                                        }
									 
									
	  