class CommandLineInput{
public static void main(String [] args)
{
int number,invalidCount=0,validCount=0;
for(int i=0;i<args.length;i++)
{
 try{
number=Integer.parseInt(args[i]);
validCount++;
System.out.println("valid number at "+i+" : "+args[i]);
 } 
 catch(NumberFormatException e){
 invalidCount++;
 System.out.println("invalid number at "+i+" : "+args[i]);
 }


}

System.out.println("Valid entries:  "+validCount);
System.out.println("Invalid entries: "+invalidCount);
}
}