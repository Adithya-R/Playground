import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int a=4;
      for (int i=1;i<=n;i++)
      {
        System.out.print(a+" ");
        a=a+i*i;
      }
	}
}