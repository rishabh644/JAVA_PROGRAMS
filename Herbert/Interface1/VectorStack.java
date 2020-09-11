import Interface2.*;

class VectorStack implements IntStack{

private int stck[];
private int tos;
VectorStack(int size)
{
  stck=new int[size];
  tos=-1;

}
public void push(int vl)
{
if(tos==stck.length-1)
 {
int tmp[]=new int[stck.length*2];
for(int i=0;i<stck.length;i++)
   {
tmp[i]=stck[i];
      }
stck=tmp;
stck[++tos]=vl;

  }
else
stck[++tos]=vl;
 
 }
 
 public int pop()
 {
 
 if(tos==-1)
  {
 System.out.println("Stack is empty");
 return 0;
   }
 else
 return stck[tos--];
 
    }
   }