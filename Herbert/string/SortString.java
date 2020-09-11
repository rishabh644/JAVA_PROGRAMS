
class SortString {
 static String arr[]={
  "now","is","the","time","for","all","good","men","to","come","to","the","aid","of","their","country" };
  public static void main(String args[]){
  int i,j;
  System.out.println("See the unsorted string array");
  
  for(i=0;i<arr.length;i++)
  {
  System.out.print(arr[i]+" ");
  }//bubble sort comparison and swapping adjacent element
  for(i=0;i<arr.length-1;i++)
    {
	   for(j=0;j<arr.length-1-i;j++)
	    {
		   if(arr[j].compareTo(arr[j+1])>0)
		   {
		     String t=arr[j];
			 arr[j]=arr[j+1];
			 arr[j+1]=t;
			 }
		}
		
    }			 
 System.out.println("\nNow see the string in the order of Dictionary");
   
  for(i=0;i<arr.length;i++)
  {
  System.out.print(arr[i]+" ");
  }
 
 
 }  
    }