package july20.MyPack;

public class Balance {

  public   Balance() {
		System.out.println("You have to rise standard of leaving of my family");
	}


  String name;
  double bal;
  
public  Balance( String n , double b) {
  
  name = n;
  bal= b;
  
                 }
				 
public  void show() {
  if(bal<0)
   System.out.println("----->");
  System.out.println(name + ": $" + bal);
  
     }
	 
  }

