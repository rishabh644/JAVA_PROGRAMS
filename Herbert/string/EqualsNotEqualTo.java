// equlas() vs ==, == compare to object have same reference or not, whereas equlas 
//compare characters of two string object

class EqualsNotEqualTo{
public static void main(String args[])
{
   String s1="Hello";
   String s2=new String(s1);
   
     System.out.println(s1+" equals "+ s2+ " -> "+s1.equals(s2));
	 System.out.println(s1+ " == " +s2+ " -> " +(s1==s2));
	 System.out.println(s1.compareTo(s2));
	 
	 }
	  
                         }