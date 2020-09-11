class BitLogic{
 public static void main(String args[]){
  String binary[]={
  "0000","0001","0010","0011","0100","0101","0110","0111","1000","1001","1010","1011","1100","1101","1110","1111"};
  int a=3;
  int b=6;
  int c=a|b;
  int d=a&b;
  int e=a^b;
  int f=(~a&b)|(a&~b);
  System.out.println("a: "+a+" b: "+b+" c: "+c+" d: "+d);
  System.out.println("e : "+e+" f "+f);
  if(true)
  {
	  System.out.println("java does not take 1 or 0  as bollean value");
 }
 }
}