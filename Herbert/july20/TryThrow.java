class TryThrow {

 static void mthd() {
 System.out.println("Inside mthd ");
 throw new RuntimeException();
                          }
 public static void main(String args[])
   { try{
	 System.out.println("Inside main");
   mthd(); }
   catch(Exception e) {
     System.out.println("Runtime Exception catched ");
                                  }
   }
                  }
	 