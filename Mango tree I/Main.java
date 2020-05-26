import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
	int r =in.nextInt();
	int c =in.nextInt();
      int n=in.nextInt();
      if(n<=r || (n-1)%r==0 || n%r==0)
        System.out.println("Yes");
      else
        System.out.println("No");
	}
}