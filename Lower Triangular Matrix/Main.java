import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
         int n,i,j,c=1;
         n=in.nextInt();
      	 int a[][]=new int[n][n];
         for(i=0 ; i<n;i++)
         {
           for(j=0;j<n;j++)
           {
             a[i][j]=in.nextInt();
             if(i<j && a[i][j]!=0)
             {
               c=0;
               break;
             }
           }
           if(c==0)
             break;
         }
      if (c==1)
      System.out.println("yes");
      else
        System.out.println("no");
      
	}
}