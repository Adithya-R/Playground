import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		 Scanner in=new Scanner(System.in);
      int n= in.nextInt();
      for(int i=1;i<=n;i++)
      {
        for(int j=1;j<=n;j++)
        {
          if(i<=j)
          System.out.print(n+"");
          else
            System.out.print(j+n-i+"");
        }
        System.out.println();
      }
	}
}