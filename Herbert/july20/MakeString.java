
// Construct one String from another

class MakeString {
   public static void main(String [] r) {
   
   char c[]={'J','A','V','A','I','S','W','O','R','L','D'};
   String s1=new String(c);
   String s2=new String(s1);
   String s3=new String(c,4,5);
   String s4="We will get RPF Cooking work";
   String s5="We will get madhupur box line carrying work";
   // Because a String object is created for every string literal 
   // You can use a String literal any place you can use a String object
   System.out.println(s1);
   System.out.println(s2);
   System.out.println(s3);
   System.out.println(s4);
   System.out.println(s5);
   System.out.println("Rishabh Pandey length "+"Rishabh Pandey".length());
                                          }
										  
				    }