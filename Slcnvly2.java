class Draw122{
int i,j,k,rw,cnts=0,cnt=1;
Draw122(int rw)
{
this.rw=rw/3;
}
void drawHexagon()
{
while(cnt<=rw)
{
for(i=1;i<=rw-cnt+1;i++)
System.out.printf(" ");
if(cnt==1)
{System.out.printf("*");cnts++;}
else{for(j=1;j<=2;j++){
System.out.printf("*");
for(k=1;k<=cnts;k++)
{System.out.printf(" ");}
}
 cnts+=2;}
System.out.println();
cnt++;
}
for(i=1;i<=rw;i++){
for(j=1;j<=2;j++){
System.out.printf("*");

for(k=1;k<=cnts;k++)
{ System.out.printf(" "); }

               }
 System.out.println();}
 cnt=1;
 cnts-=2;
 while(cnt<=rw)
{for(i=1;i<=cnt;i++)
System.out.printf(" ");

if(cnt==rw)
{System.out.printf("*");cnts++;}
else{
	for(j=1;j<=2;j++){
System.out.printf("*");
for(k=1;k<=cnts;k++)
{System.out.printf(" ");}
   }
 cnts-=2;}
System.out.println();
cnt++;
}
}
}class Slcnvly2{
public static void main(String [] args)
{
Draw122 obj=new Draw122(24);
obj.drawHexagon();
}
                    }




