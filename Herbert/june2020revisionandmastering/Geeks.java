class Geeks{
    static void bitWiseOp(int a, int b, int c){
        
        // Your code here
        int d,e,f,g;
        d=a^a;
        e=c^b;
        f=a&b;
        g=c|(a^a);
        e=~e;
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(e);
        
        
    }
		 static void isPrime (int n) 
	 {    char ch='y';
	      if(n==1)
	       { System.out.println("No");
	          ch='n';}
            for(int i=2;i<=Math.sqrt(n);i++)
            {
                //Your code here
                if(n%i==0)
                {
                    System.out.println("No");
                    ch='n';
                }
            }
        if (ch=='y')    
        System.out.println("Yes");
	 
	  }
	  
}
