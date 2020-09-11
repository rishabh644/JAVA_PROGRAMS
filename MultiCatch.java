//will run for only one commond line input
class MultiCatch {
public static void main(String []args ){
int i=args.length;

try{
String myString[]=new String[i];
if(args[0].equals("Java"))/*first exception*/
System.out.println("First word is Java !");
System.out.println("Number of arguments = "+i);
int x=18/i;/*second excception*/
int y[]={555,999};
y[i]=x;}/*third exception*/
catch(NullPointerException e){
	System.out.println(" A null pointer exception: " +e);
}
catch(ArithmeticException e){
System.out.println("Divide by 0: "+e);}
catch(ArrayIndexOutOfBoundsException e){
	System.out.println("Array Index OoB : "+e);
}
}
}