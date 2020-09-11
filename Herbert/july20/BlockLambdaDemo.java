

 // A block lambda that computes the factorial
 // One key difference is that you must use return statement to return a value 
  interface NumericFunc {
	  int func(int n);
                          }
						  
  class BlockLambdaDemo {
	   public static void main(String f[]) {
		   // This block lambda computes the factorial of num
		   
		   NumericFunc factorial=(n) -> {
			   int pro=1;
			   for(int i=1;i<=n;i++)
				   pro*=i;
			   return pro;
		                                  };
			System.out.println(" The factorial of 5 is "+factorial.func(5));
			System.out.println(" The factorial of 6 is "+factorial.func(6));
	                             }
                         }