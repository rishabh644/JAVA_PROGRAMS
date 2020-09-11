
import java.util.ArrayList;
import java.util.Iterator;
 public class ArrayListConcept{
    
	public static void main(String [] arr) throws Exception {
		
	int a[]=new int[6]; // static array size is fixed currently i can store maximum 3 value in a
	// We don't use static array in application development 
	// size doesn't matter in case of array list
	
	ArrayList ar=new ArrayList();
	
	ar.add(10); //0
	//ar.addAll(20); //1
	ar.add(30); //1
	
	System.out.println("New Length "+ar.size());
	
	ar.add(33); //2
	ar.add(50); //3
	ar.add(40); //4
	ar.add(89); // 5
	ar.add(90); //6
	ar.add(95); //7
	
	System.out.println("New Length "+ar.size());
	// Dublicates allowed
	ar.add(95);
	System.out.println("New Length "+ar.size());
	// It maintains insertion order
	// Next value will be stored at ar.size() index (acc. to zero based indexing)
	// Not synchronized
	// allow random access to fetxh the element because it stores the values on the basis of index
	ar.add(434);
	ar.add(567);
	ar.add(434);
	System.out.println("New Length "+ar.size());
	System.out.println("Index 1 "+ar.get(1));
	System.out.println("Index 2 "+ar.get(2));
	System.out.println("Index 0 "+ar.get(0));
	System.out.println("Index 4 "+ar.get(4));
	System.out.println("Index 6 "+ar.get(6));
	
	// to print all the values from arraylist 
    // 1. for loop
    // 2. using iterator

 System.out.println(" See the all elements in array ");
  
	for(int i=0;i<ar.size();i++) {
		System.out.print( ar.get(i) + " ");
	                             }
								 
	System.out.println();							 
 
  // Currently arraylist is non generic

ar.add(90.45);
ar.add(" My name is Rishabh Pandey "); 
ar.add(true); 
 for(int i=0;i<ar.size();i++) {
		System.out.print( ar.get(i) + " ");
	                             }
										   
   
   // Now lets create generic arraylist
   ArrayList<Integer> ar1=new ArrayList<Integer>();
   ArrayList<String> ar2=new ArrayList<String>();
   ar1.add(80);
   ar1.add(498);
   ar2.add(" Rishabh ");
   ar2.add(" Anne Frank ");
   ar2.add(" Ande Mare ");   
   // Employee class Objects:
   
  Employee e1=new Employee(" Newton ",48," Physics ");
  Employee e2=new Employee(" Einsteen ", 25,"Nuclear");
  Employee e3=new Employee(" Gallio ",30,"Dynamics");
  
  ArrayList<Employee> ar5=new ArrayList<Employee>();
  
  ar5.add(e1);
  ar5.add(e2);
  ar5.add(e3);
  Iterator<Employee> it=ar5.iterator();
  System.out.println();
  while(it.hasNext())
  {
	  
	Employee emp=it.next();
	System.out.print(emp.name + emp.age +emp.dept);
	System.out.println();
  }	  
  //*********************************************

   // addAll()
  ArrayList<String> ar9=new ArrayList<String>();
  ArrayList<String> ar10=new ArrayList<String>();
  ar9.add(" Papu ");
  ar9.add(" Bhaiya ");
  ar9.add(" is good ");
  ar10.add(" I ");
  ar10.add(" have ");
  ar10.add(" to ");
  ar10.add(" Study ");
  ar10.add(" Hard ");
  ar10.add(" to be a good son "); 
  ar9.addAll(ar10);
  System.out.println("***********************************");
  System.out.println();
  System.out.println();
  System.out.println();
  for(int i=0;i<ar9.size();i++) {
	  System.out.println(ar9.get(i));
                                }
								
  System.out.println("***********************************");

  System.out.println();
  System.out.println();
  System.out.println();
  ar9.removeAll(ar10);
  for(int i=0;i<ar9.size();i++) {
	  System.out.println(ar9.get(i));
                                }
  // demonstrating retainAll()
ar9.addAll(ar10);
System.out.println("***********************************");

  System.out.println();
  System.out.println();
  System.out.println();
  System.out.println(" After again addAll() ");
  for(int i=0;i<ar9.size();i++) {
	  System.out.println(ar9.get(i));
                                }
  ar9.retainAll(ar10);
  System.out.println("         After retainAll           ");       
  System.out.println("***********************************");

  System.out.println();
  System.out.println();
  System.out.println();
for(int i=0;i<ar9.size();i++) {
	  System.out.println(ar9.get(i));
                                }
  
								
								
  
  

System.out.println(" ***************************************** ");
System.out.println();
System.out.println();
System.out.println();
System.out.println(ar9);





				
															  
															  }



   }



















