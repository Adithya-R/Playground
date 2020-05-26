import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
      	int b=in.nextInt();
        int c;
      	c=a;
      	a=b;
      	b=c;
      	System.out.println(a);
      	System.out.println(b);
      	
    }
}