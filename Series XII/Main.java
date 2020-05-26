import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		// fill your code
      Scanner in=new Scanner(System.in);
      int n= in.nextInt();
      int a=9;
      int b=11;
      int c,temp;
      System.out.print(a+" "+b+" ");
      for(int i=1;i<=n-2;i++)
      {
        c=a+b;
        System.out.print(c+" ");
       	temp=c;
        a=b;
        b=temp;
        
      }
	}
}
