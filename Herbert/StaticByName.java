class StaticByName{
public static void main(String [] args)
{
int [] ar={1,2,34,67};
int arrr[];
arrr=new int[4];
StaticDemo.callme();
System.out.println("b= "+StaticDemo.b);
for(int i=0;i<4;i++)
{
System.out.println(ar[i]);
   }
   System.out.println(args[0]);
   System.out.println(args[1]);
 }
}