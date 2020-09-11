package MyPack;

 class Client implements Callback2 {

public void callback(int p) {

  System.out.println("callback called with "+p);
  
  }
public  void nonIfaceMeth() {
  
   System.out.println(" Classes that implements interfaces "+
                        " may also define others member too. ");
						
						}
			}