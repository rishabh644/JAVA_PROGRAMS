
import java.util.LinkedList;


class LinkedListConcept {
 
  public static void main(String [] arg) {
  
  LinkedList<String> ll= new LinkedList<String>();
     
  // add:

  ll.add(" I ");
  ll.add(" have ");
  ll.add(" to  ");
  ll.add(" work ");
  ll.add(" hard ");
  ll.add(" to ");
  ll.add(" help ");
  ll.add(" me ");
  ll.add(" and  family ");
  ll.add(" I have to work hard I am laying very back but i will put my whole effortt  ");
	System.out.println("*****************************************")	;
    System.out.println();	
	System.out.println();
	System.out.println();
	System.out.println();
  System.out.println(" Content of LinkedList = "+ll);
  ll.addFirst(" Naveen Sir ");
  ll.addFirst(" JST Sir ");
  ll.addFirst(" Shashi Sir ");
  ll.addFirst(" Ashish Dhanuka Sir ");
  ll.addLast(" Rishabh you have to clear GATE with AIR 1 ");
  System.out.println("*****************************************")	;
    System.out.println();	
	System.out.println();
	System.out.println();
	System.out.println();
  System.out.println(" Content of LinkedList = "+ll);
    System.out.println("*****************************************")	;
    System.out.println();	
	System.out.println();
	System.out.println();
	System.out.println();
  
  System.out.println(" ll.get(0) "+ll.get(0));
   ll.set(0," Kapil Jain Sir ");
   System.out.println(" ll.get(0) "+ll.get(0));
   ll.removeFirst();
   ll.removeLast();
   
    System.out.println("*****************************************")	;
    System.out.println();	
	System.out.println();
	System.out.println();
	System.out.println();
    System.out.println(" Content of LinkedList = "+ll);
    ll.remove(1);
	
	System.out.println("*****************************************")	;
    System.out.println();	
	System.out.println();
	System.out.println();
	System.out.println();
    System.out.println(" Content of LinkedList = "+ll);
	System.out.println("*****************************************")	;
    System.out.println();	
	System.out.println();
	System.out.println();
	System.out.println();
	
	System.out.println(" Using For loop ");
	for(int i=0;i<ll.size();i++)
	{
		System.out.println(ll.get(i));
	
										  
	}			  
	System.out.println("*****************************************")	;
    System.out.println();	
	System.out.println();
	System.out.println();
	System.out.println();
	System.out.println(" Using Advance For Loop ");
	for(String s:ll)
	{
		System.out.println(s);
	}
	
										  
										  }
										  
										  
										  
										  
						}