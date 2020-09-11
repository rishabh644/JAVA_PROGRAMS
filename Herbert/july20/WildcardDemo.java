

// Use a WildCard.

class Stats<T extends Number> {
  T[] nums; // array of Number or subclass 
  // Pass the constructor a reference to
  // an array of type Number or subclass.
  Stats(T[] o) {
  nums=o;
               }
			   
			   
  // Return type double in all cases.
  
  double average() {
  
   double sum=0.0;
     
	 for(int i=0;i<nums.length;i++) 
	      sum+=nums[i].doubleValue();
		  
	return sum/(nums.length);
	
	                 }
					 
					 
	// Determine if average of two objects are same
	// Notice the use of wildcard
	
	boolean sameAvg(Stats<?> ob) {
	
	   if(average()==ob.average())
	        return true;
	   
	   return false;
	                              }
								  
								  
								  
			}
			
  class WildcardDemo {
	  
	  public static void main(String arg[]) {
		  Integer inums[]={1,2,3,4,5};
		  Stats<Integer> iob=new Stats<Integer>(inums);
		  
		  System.out.println("iob average is "+iob.average());
		  
		  Double dnums[]={1.1,2.2,2.3,2.4,2.5,2.6};
		  
		  Stats<Double> dob=new Stats<Double>(dnums);
		  
		  System.out.println(" dob average is "+dob.average());
		  Float fnums[]={1.0F,2.0F,3.0F,4.0F,5.0F};
		  Stats<Float> fob=new Stats<Float>(fnums);
		  System.out.println("fob average is "+fob.average());
		  
		  System.out.println(" See whose averages are same ");
		  System.out.println();
		  System.out.println("-------------------------------------------------");
		  System.out.println();
		  if(iob.average()==fob.average())
			  System.out.println("Average of iob and fob are same");
		  if(iob.sameAvg(dob))
			  System.out.println("Average of iob and dob are same");
		  else
			  System.out.println("Average of iob and dob are different");
	                                               }
												   
                                }
		  
		  
		  
	  
		  