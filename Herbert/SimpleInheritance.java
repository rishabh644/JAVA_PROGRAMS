class SimpleInheritance{

public static void main(String args[])
{
Apple superOb=new Apple();
Orange subOb=new Orange();
superOb.i=67;
superOb.j=98;

System.out.println("Content of superOb: ");
superOb.showij();
System.out.println();
subOb.i=90;
subOb.j=56;
subOb.k=99;
subOb.sum();
  }
 }