import java.util.Hashtable;
import java.util.Set;
import java.lang.Enum;
import java.util.Enumeration;
 class HashTableConcept {
 
   public static void main(String [] args ) {
     // it is similar to hashmap , but it is synchronised
	 // stores the value on the basiz of key-val
	 //key---->Object--HashCode--->value
	 
	 Hashtable h1=new Hashtable();
	 h1.put(1,"Tom");
	 h1.put(2,"Mathew");
	 h1.put(3,"John");
	 h1.put(4,"karan");
	 h1.put(99,"Rishabh");
	 
	 Hashtable h2=new Hashtable();
	 
	 h2=(Hashtable)h1.clone();
	 System.out.println(" the values from h1 "+h1);
	 System.out.println(" the values from h2 "+h2);
	 
	 h1.clear();
	 System.out.println(" the values from h1 "+h1);
	 System.out.println(" the values from h2 "+h2);
	 
	 // contains value:
	 Hashtable st=new Hashtable();
	 st.put("A","Nashik");
	 st.put("B","Maharastra");
	 st.put("C","HouseKeeping");
	 
	 if(st.containsValue("Maharastra"))
		 System.out.println(" Value contains Maharastra ");
	 
		 //print all the values from hashtable using -- Enumeration -- elements()
		 
	 Enumeration e=st.elements();
	 System.out.println(" print values from st using enumeration ");
	 
	 while(e.hasMoreElements()) {
		 System.out.println(e.nextElement());
	                            }
	 // get all the values from hashtable using -- entrySet() -- set of hashtable values:
     
     System.out.println("print values from st using entry set ");
     
      Set s=st.entrySet();
      System.out.println(s);	  
	 
	 
   
     Hashtable st1=new Hashtable();
	 st1.put("A","Nashik");
	 st1.put("B","Maharastra");
	 st1.put("C","HouseKeeping");
     st1.put("C","GST Office");  //it contains only unique values
	 // no null key and null values
	 // st1.put("D",null);// null pointer exception
	 // check both the hashtables are equal or not:
	 if(st.equals(st1))
		 System.out.println("both are equal");
	 
     System.out.println(" Values from st1 "+st1);
     // get the value from a key:
	 System.out.println(st1.get("A"));
	 // get the hashcode of hashtable object:
	 System.out.println("the hash code value of st1 :" +st1.hashCode());
   
   
   
   
   
   
   
   
   
   
                                            }
						
						
						
						
						}