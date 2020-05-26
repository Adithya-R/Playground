import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		// fill your code
      Scanner in=new Scanner(System.in);
      int n= in.nextInt();
      int a=0;
      int b=0;
      int c=1,temp1,temp2,d;
      System.out.print(a+" "+b+" "+c+" ");
      for(int i=1;i<=n-3;i++)
      {
        d=a+b+c;
        System.out.print(d+" ");
     	a=b;
        b=c;
        c=d;
      }
      
	}
}
