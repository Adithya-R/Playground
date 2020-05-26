import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
           Scanner in = new Scanner(System.in);
	int m =in.nextInt();
      int n=in.nextInt();
      while(m>=n)
      {
        System.out.println(m);
        m--;
      }
    }
}