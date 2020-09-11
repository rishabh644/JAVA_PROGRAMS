class Draw121{
int i,j,rw,cnt=1,cnts=1;

Draw121(int rw)
{
this.rw=rw;
}

void drawPyramid()
{ while(cnt<=rw)
  {
    for(i=1;i<=rw-cnt;i++)
   {
printf(" ");
     }
  for(j=1;j<=counts;j++)
  {
printf("* ");
    }
println();
cnt++;
cnts+=2;}
  }
   }

public static void main(String [] args)
{
Draw121 obj=new Draw121(4);
obj.drawPyramid();
}
                    }

