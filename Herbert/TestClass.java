import java.io.BufferedReader;
import java.io.InputStreamReader;


import java.util.*;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),i,j,x,a,b,c,sm=0,q,cn=0;
        int mat[][]=new int[n][n];
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                mat[i][j]=sc.nextInt();
            }
        }
        q=sc.nextInt();
        while(cn<q){
        x=sc.nextInt();
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        
        if(x==1)
        {
            for(i=a-1;i<b && i<n;i++)
            {
                for(j=0;j<n;j++)
                {
                    mat[i][j]=mat[i][j] ^ c;
                    
                    
                }
            }
        }
		cn++;
		}
		for(i=0;i<n;i++)
			sm+=mat[i][i];
        System.out.println(sm);
            
                        

    }
}
