import java.io.*;
class A3darray
{
public static void main(String args[])
{
int my3darray[][][]=new int[2][2][2];
int i,j,k;
for(i=0;i<2;i++){
    for(j=0;j<2;j++){
	    for(k=0;k<2;k++){
		     my3darray[i][j][k]=i*j*k;}
			         }
			    }
				for(i=0;i<2;i++){
    for(j=0;j<2;j++){
	    for(k=0;k<2;k++){
		     System.out.println(" "+my3darray[i][j][k]);
			 }
			         }
            					 }
}
}