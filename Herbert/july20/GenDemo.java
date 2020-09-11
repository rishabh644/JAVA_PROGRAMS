
// A simple generic class.
// Here , T is a type parameter that
// will be raplaced by a real type
// when an object of type Gen is created.

class Gen<T> {
  T ob; // declare an object of type T
  
  // Pass the constructor a reference to
  // an object of type T
  
  Gen(T o) {
  ob=o;
           }
		   
  // Return ob
  T getob() {
   return ob;
            }
  // Show type of T.
  
  void showType() {
  System.out.println(" Type of T is "+ob.getClass().getName());
  
                     }
					 
             } 
			 
 // Demonstrate the generic class.
 
 class GenDemo {
	 public static void main(String [] r) {
		 // Create a Gen reference for Integers
		 
		 Gen<Integer> iob;
		 
		 /* Create a Gen<Integer> object and assign
		  reference to iOb. Notice the use of autoboxing
		  to encapsulaate the value 88 within an Integer object*/
		  iob=new Gen<Integer>(88);
		 // Show the type of data used by iob.
		 iob.showType();
		 //Get the value of iob in v
		 //  use of autounboxing 
		 
		 int v=iob.getob();
		 System.out.println("value: "+v);
		 System.out.println();
		 
	// Create a Gen object for Strings.
	Gen<String> strob=new Gen<String>("Generic use");
	// Show the type of data used by strob
	strob.showType();
	// Get the value of strOb. Again ,
	// notice that no cast is needed
	String str=strob.getob();
	System.out.println("Value: "+str);
	                                        }
                } 
		 
		  
		 
  
  