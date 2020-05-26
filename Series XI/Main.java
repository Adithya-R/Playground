import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		// fill your code
      Scanner in=new Scanner(System.in);
      int n= in.nextInt();
      double a=95.0;
      int x=0;
      for(int i=1;i<=n;i++)
      {
        
        System.out.print(a+" ");
        a=a+20.5+x;  
        x=x+2;
      }
	}
}
