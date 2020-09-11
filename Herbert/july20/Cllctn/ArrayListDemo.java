
// Demonstrate ArrayList

import java.util.*;

class ArrayListDemo {

 public static void main(String args[])
 {
	  // Create an array list
	 
	   ArrayList<String> al=new ArrayList<String>();
	   
	   System.out.println(" Initial size of al: "+al.size());
	   
	   // Add elements to the array list.
	   
	   al.add("A ");
	   al.add("B");
	   al.add("C");
	   al.add("D");
	   al.add("E");
	   al.add("F");
	   al.add(1,"B52");
	   
	   System.out.println("Size of al after additions : "+al.size());
	   
	   // Display the array list.
	   
	   System.out.println("Contents of al : "+al);
	   
	   // Remove elements from the array list.
	   
	   al.remove("F");
	   al.remove(2);
	   System.out.println("Size after deletions : "+al.size());
	   System.out.println("Contents of arraylist : "+al);
	                                                     
														 
                                                    }
													
    }