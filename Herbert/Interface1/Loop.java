class Loop{
public static void main(String args[])
{
 int ar[],i=0,tr[];
 ar=new int[10];
 
 for(i=0;i<10;i++)
 ar[i]=i*3;
 for(i=0;i<10;i++)
 System.out.println(ar[i]);
 tr=ar;
 tr[0]=98;
 for(i=0;i<10;i++)
 System.out.println(ar[i]);
 
  }
      }