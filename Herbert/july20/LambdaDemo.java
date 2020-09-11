
  // Demonstrate a simple lamda expression
  
  // A functional interface
  
  interface MyNumber {
  double getValue();
                      }
					  
  class LambdaDemo {
  
   public static void main(String r[]) {
   
   MyNumber myNum; // declare an interface reference
   
   // Here , the lamda expression is simply a constant expression
   // When it is assigned to myNum , a class instance is 
   // contructed in which lamda expression implements 
   // the getValue() method in MyNumber
   myNum=()->123.45;
   
   // Call getValue() , which is specified by previous lamda  expression
   
	System.out.println(" A fixed value "+myNum.getValue());
 //Here , a more complex expression is used

   myNum=()->Math.random()*100;
// These call the lamda expression defined in the previous line
  System.out.println(" A random value : "+myNum.getValue())  ;
  System.out.println(" Another random value : "+myNum.getValue());
/* A lamda expression must be compatible with the methos defined by functional interface
 this wont work 
myNum=()->"123.30"; */ 
                                               }
						}