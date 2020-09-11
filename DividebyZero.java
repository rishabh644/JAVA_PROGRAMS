class DividebyZero{
static int anyFunction(int x,int y){
 int z ;
  try{
	  
 z=x/y;
 System.out.println("meons");

     }
    
	catch (ArithmeticException e){
System.out.println("z=x/y is bypassed..Enter y as non-zero");
             z=9;                  }
 return z;
                                       }
public static void main(String [] args)
 {
int result=anyFunction(25,0);
System.out.println("Result :"+result);
 }
         }