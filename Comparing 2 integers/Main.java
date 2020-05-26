import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
	int a =in.nextInt();
	int b =in.nextInt();
    if(a>b)
	System.out.println(a+" greater than "+b);
      else if(a<b)
        System.out.println(a+" less than "+b);
     else
       System.out.println(a+" and "+b+" are equal");
    }
}