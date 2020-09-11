class AutoArray{
	
	static void  mthd(int ...v)
	{
		for(int x:v)
		{
			System.out.println(x);
		
		}
		
	}
public static void main(String [] args)
{
int month_days[]={31,28,31,30,31,30,31,31,30,31,30,31};
int ar[];
System.out.println("April has "+month_days[3]+" days");
System.out.println(month_days.length);
   ar=month_days;
   System.out.println(ar.length);
   ar[0]=34;
   System.out.println(month_days[0]);
   mthd(month_days);
   mthd();//not allow with int[] v style therefore using int ... v style
   }
 }