import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
      	int n=in.nextInt();
       int x;
      	for(int i=1;i<=n;i++)
        {
          for(int j=1;j<=i;j++)
          {
              x=j%2==0?0:1;
              System.out.print(x+" ");
          }
          System.out.println();
        }
	}
}