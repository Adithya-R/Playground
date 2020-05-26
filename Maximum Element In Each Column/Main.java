import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
         int row,col,i,j,max;
         row=in.nextInt();
         col=in.nextInt();
      	 int a[][]=new int[row][col];
         for(i=0 ; i<row;i++)
         {
           for(j=0;j<col;j++)
           {
             a[i][j]=in.nextInt();
         }    
	}
        for(j=0;j<col;j++)
         {
          max=0;
             for(i=0 ; i<row;i++)
           {
             if(a[i][j]>max)
               max=a[i][j];
            }
          System.out.println(max);
		}
    }
}