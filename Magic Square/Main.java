import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
         int rsum=0,dsum=0,i,j,R=1;
         int n=in.nextInt();
      	 int a[][]=new int[n][n];
         for(i=0 ; i<n;i++)
         {
           rsum=0;
           for(j=0;j<n;j++)
           {
             a[i][j]=in.nextInt();
             rsum=rsum+a[i][j];
             if((i==j) || (i+j==n+1))
               dsum=dsum+a[i][j];
           }
           if(rsum!=n*(n*n+1)/2 && dsum!=n*(n*n+1)/2)
           {             
             R=0;
           	break;
           }
         }
      if(R==1)
        System.out.println("yes");
      else
        System.out.println("no");
      
      
	}
}