import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		// fill your code
      Scanner in=new Scanner(System.in);
      int n= in.nextInt();
      int a=2;
      int x=3;
      for(int i=1;i<=n;i++)
      {
        
        System.out.print(a+" ");
        a=a+x;
        x=x*2;
        
      }
	}
}
