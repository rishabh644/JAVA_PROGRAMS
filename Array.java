import java.io.*;
import java.util.Scanner;
class Array
{
public static void main(String args[])
{
int array[];
array=new int [10];
int i;
System.out.println("Enter ten element in array\n");
Scanner in= new Scanner(System.in);
for(i=0;i<10;i++)
{
array[i]=in.nextInt();
}
System.out.println("The square table for  ten element in array are\n");
for(i=0;i<10;i++)
{
System.out.println(array[i]+"  :  "+array[i]*array[i]);

}
       }
}