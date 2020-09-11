

import java.util.HashMap;
import java.util.Map.Entry;
class HashMapConcept {

    public static void main(String[] args ) {
	
	// HashMap is a class  implements Map Interface
    // extends AbstractMap
	// it contains only unique elements
	// stores the-values-key-value pair
	// it may have one mull key and multiple null values-key-value
	// it maintains no order
	// hashmap is non-synchronised   -- not thread safe multiple thread can access same hash map
	// concurrent modification exception--Fail-Fast condition
	HashMap<Integer , String >  hm=new HashMap<Integer,String>();
	hm.put(1," Rishabh ");
	hm.put(2," numpy ");
	hm.put(3," pycham ");
	hm.put(4," python ");
	
	System.out.println(hm.get(2));
	System.out.println(hm.get(4));
	System.out.println(hm.get(1));
	System.out.println(hm.get(125));
	
	// advance type for loop
	
	for(Entry m:hm.entrySet()) {
		System.out.println(m.getKey() +" "+m.getValue());
	                            }
								
	System.out.println(hm);
    hm.remove(3);
    System.out.println(hm);

    HashMap<Integer, Employee > emp=new HashMap<Integer , Employee>();

    Employee e1= new Employee(" Albert ",54," Physics ");
    Employee e2=new Employee(" Rafel  ",32,	" S.P ");
	Employee e3=new Employee(" Macgra ",41," President ");
	emp.put(1,e1);
	emp.put(2,e2);
	emp.put(3,e3);
	
    // traverse the hasjmap:
	
	for(Entry<Integer, Employee> m: emp.entrySet() ) {
		int key=m.getKey();
		Employee e=m.getValue();
		System.out.println(" Employee "+key + " Info ");
		System.out.println(e.name +" "+e.age+" "+e.dept);
	                                                  }
    













          
                                                    } 

}