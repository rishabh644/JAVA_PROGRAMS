class Conversion{
public static void main(String args[])
  {byte b;
  int i=263;
  double d=323.142;
  int j[];
  j=new int[1];
  System.out.println("Conversion of int to byte");
  b=(byte) i;
  System.out.println("i and b "+i+" "+b);
  System.out.println("Conversion of double to int");
  i=(int) d;
  System.out.println("d and i "+d+" "+i);
  System.out.println("Value of j is "+j[0]);}
     }