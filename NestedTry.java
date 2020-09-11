class NestedTry {
public static void main(String [] args){
int a=args.length;
try{
	 int b=42/a; /*first exception*/
System.out.println("a : " +a);
if(a==1){ 
a=a/(a-a);/*second exception*/ 
}
try{
	if(a==2){
	int []ar={1};
	ar[a]=3;
  }
     }
catch(ArrayIndexOutOfBoundsException e){
System.out.println("There was array index out of bound exception "+e);
   
   
   }
} 

catch(ArithmeticException e);{
	System.out.println("Divide by zero : "+e);
     }

System.out.println("Be Positive and Happy ");
 
 }
   
   }
	
	