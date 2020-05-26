import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		 Scanner in=new Scanner(System.in);
      int n= in.nextInt();
      for(int i=1;i<=n;i++)
      {
        for(int j=1;j<=2*n;j++)
        {
          if(j<=(2*n)-(2*i-1))
          System.out.print(j+" ");
        }
        System.out.println();
      }
	}
}