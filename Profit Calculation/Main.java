import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
	 Scanner in = new Scanner(System.in);
	int a =in.nextInt();
	int b =in.nextInt();
      int c = in.nextInt();
      int res=(a*(b-c))-100;
	System.out.println("The profit obtained is Rs."+res);

	}
}