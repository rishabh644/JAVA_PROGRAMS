class ThrowDemo1 {

 static void throwOne() throws IllegalAccessException{
     System.out.println("Inside throwOne. ");
	 throw new IllegalAccessException("demo");
                                }
								
 public static void main(String []sls) {
	 System.out.println("Inside main calling throwOne ");
   try {	
   throwOne();
       }
   catch(Exception e) {
	   System.out.println("Exception catched " );
	   
                         }
					
                                         }
                    }