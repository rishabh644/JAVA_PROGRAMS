  
  class GgetChars {
  
   public static void main(String args[]) {
   
   String s=" This is a demo of the getChars method. ";
   String t=" This is a Demo of the getChars method. ";
   int start=10;
   int end=14;
   char buf[]=new char[end-start];
   String ss="Year Planner 2020";
   s.getChars(start,end,buf,0);
   System.out.println(buf);
   buf=new char[8];
   ss.getChars(5,13,buf,0);
   System.out.println(buf);
   System.out.println(ss.charAt(5));
   if(s==t)// sam boolean equals(Object s)
	   System.out.println("s and t both are same");
   if(s.equalsIgnoreCase(t))
	   System.out.println("s and t are same irrespective of case");
                                           }
					 
					 }
					 