class StringDemo{
 
 public static void main(String []args)
 {
 String strob1="First String";
 String strob2="Second String";
 String strob3=strob1+ " and "+strob2;
 String strob4=strob1;
 String str[]={"one","two","three"}; 
 int i;
 System.out.println(strob1);
 System.out.println(strob2);
 System.out.println(strob3);
 
 System.out.println("Length of strOb1 :"+strob1.length());
 System.out.println("Char at index 3 :"+strob1.charAt(3));
 if(strob1.equals(strob2))
	 System.out.println("strob1==strob2");
 else
	 System.out.println("strob1!=strob2");
 if(strob1.equals(strob4))
	 System.out.println("strob1==strob4");
 else
	 System.out.println("strOb1!=strob4");
strob2="Jai shri krishna";//only by these way we can change
System.out.println(strob2);
for(i=0;i<str.length;i++)
{
	System.out.println(str[i]);
}

 
                              }
		
		 
		  }