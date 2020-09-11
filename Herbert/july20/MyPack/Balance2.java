package MyPack;

public class Balance2 {

  public   Balance2() {
		System.out.println("You have to rise standard of leaving of my family");
	}


  String name;
  double bal;
  
public  Balance2( String n , double b) {
  
  name = n;
  bal= b;
  
                 }
				 
public  void show() {
  if(bal<0)
   System.out.println("----->");
  System.out.println(name + ": $" + bal);
  
     }
	 
  }

