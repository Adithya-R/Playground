import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
      String s=in.next();
      StringBuilder sb = new StringBuilder(s);
      System.out.println(sb.reverse());
	}
}