
// Demonstrate equals() and equalsIgnoreCase().

 class EqualsDemo {
 
  public static void main(String ar[]) {
  
  String s1="Hello";
  String s2="Hello";
  String s3="Good-bye";
  String s4="HELLO";
  
  System.out.println(s1+" equals "+s2+" -> "+s1.equals(s2));
  System.out.println(s1+" equals "+s2+" -> "+(s1==s2));
  System.out.println(s1 +" equals "+s3+" -> "+s1.equals(s3));
  System.out.println(s1+" equals "+s4+" -> "+s1.equalsIgnoreCase(s4));
                                        }
					}