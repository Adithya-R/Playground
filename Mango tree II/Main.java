import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
	int r =in.nextInt();
	int c =in.nextInt();
      int n=in.nextInt();
      if(n<=r || (n-1)%r==0 || (n<=r*c && n>r*c-c))
        System.out.println("yes");
      else
        System.out.println("No");
	}
}