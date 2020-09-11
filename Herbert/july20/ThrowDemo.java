
class ThrowDemo {

 static void demoproc() {
       try {
	   throw new NullPointerException("Please god make profit of 5Lakh in papa business this year");
	          }
		catch(NullPointerException e) {
			System.out.println("Caught inside demoproc "+e);
			throw e;
		                            }
                       }
public static void main(String arry[]) {
	try {
		demoproc();
	          }
	catch(NullPointerException e) {
		System.out.println("Recaught in main "+e);
	                            }
								
                                            }
                    }
	