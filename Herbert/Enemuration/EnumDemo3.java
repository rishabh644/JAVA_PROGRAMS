enum Apple{
Jonathan(10),GoldenDel(9),RedDel(12),Winwsap(15),Cortland(8);
   private int price;
   Apple(int p){price=p;}
   int getPrice(){ return price; }
   
   }
   
   class EnumDemo3 {
   public static void main(String []args)
   {
    Apple ap[];
	System.out.println("Winwsap costs "+Apple.Winwsap.getPrice()+" cents");
	System.out.println("All apple prices:");
	ap=Apple.values();
	for(Apple ob:ap)
	{
	 System.out.println(ob+" costs "+ob.getPrice()+" cents");
	 }
	    }
		  }
		  