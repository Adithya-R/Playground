import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		// fill your code
      Scanner in=new Scanner(System.in);
      int n= in.nextInt();
      int a=0;
      int b=1;
      int c,temp;
      for(int i=1;i<=n-2;i++)
      {
        c=a+b;
       	temp=c;
        a=b;
        b=temp;        
      }
      System.out.println(b);
	}
}
