import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
      	int n=in.nextInt();
       int c=0;
      	for(int i=1;i<=n;i++)
        {
          for(int j=1;j<=i;j++)
          {
            c++;
            System.out.print(c+" ");
          }
          System.out.println();
        }
	}
}