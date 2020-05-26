import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
           Scanner in = new Scanner(System.in);
	int m =in.nextInt();
      int n=in.nextInt();
      for(int i=1;i<=n;i++)
      {
        System.out.printf("%d*%d=%d\n",i,m,i*m);
      }
    }
}