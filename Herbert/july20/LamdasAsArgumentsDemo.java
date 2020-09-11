

// Use lambda expressions as an argument to a method.

 interface StringFunc {
 String func(String n);
                       }
				
 class LamdasAsArgumentsDemo {
 
  // This method has a functional interface as the type of
  // its first parameter . Thus , it can be passed a reference to
  // any instance of that interface , including the instance created
  // by a lamda expressions
  // The second parameter specifies the String to operate on
  static String stringOp(StringFunc sf, String s) {
   return sf.func(s);
                            }
							
	public static void main(String ar[]) {
		String inStr="Lamdas add power to Java";
		
		String outStr;
		
		System.out.println(" Here is input string: "+inStr);
		
		// Here , a simple expressions lamda that uppercase a string
		// is passed to stringOp( )
		
		outStr= stringOp((str)->str.toUpperCase(),inStr);
		System.out.println(" The string in uppercase "+outStr);
		
		// This passes a block lambda that removes spaces
		
		outStr=stringOp( (str) -> {
			            String result="";
						int i;
						for(i=0;i<str.length();i++)
							if(str.charAt(i)!=' ')
								result+=str.charAt(i);
						return result;
                                     }, inStr);
									 
		System.out.println(" The string with spaces removed "+outStr);
		// Of course , it is also possible to pass a StringFunc instance
		// created by an earlier lambda exression
		
		StringFunc reverse=(str) -> {
			String result="";
			int i;
			for(i=str.length()-1;i>=0;i--)
				result+=str.charAt(i);
			return result;
		                              };
		// Now , reverse can be passed as the first parameter
		System.out.println("The string reversed :"+stringOp(reverse,"Indian Army"));
	                         }
 }