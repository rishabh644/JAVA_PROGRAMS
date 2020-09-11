class Factorial {
int result;
 int fact(int n){
  if(n==1)return 1;
  result=fact(n-1)*n;
return result;
   }
  }
class Recursion{
 public static void main(String args[])
 {
 Factorial f=new Factorial();
 System.out.println("Factorial of 3 is : "+f.fact(3));
 System.out.println("Factorial of 5 is : "+f.fact(5));
 System.out.println("Factorial of 7 is : "+f.fact(7));
  }
 }
 
  