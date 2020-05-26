import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
	int a =in.nextInt();
      String num=a%2==0?"Even":"Odd";
      System.out.println(num);
	
    }
}