import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
	int a =in.nextInt();
	int b=a%10;
      int c=(int)a/10;
	System.out.println("Alice must go in path-"+(b+c));

	}
}