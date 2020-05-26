import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		// fill your code
      Scanner in=new Scanner(System.in);
      int n= in.nextInt();
      int a=2;
      int x=1;
      for(int i=1;i<=n;i++)
      {
        
        System.out.print(a+" ");
        a=a+13*x;
        x=x+1;
        
        
      }
	}
}
