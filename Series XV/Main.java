import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		// fill your code
      Scanner in=new Scanner(System.in);
      int n= in.nextInt();
      int a=3;
      int b=8;
      int c,temp,x=2;
      System.out.print(a+" "+b+" ");
      for(int i=1;i<=n-2;i++)
      {
        c=a+b+x;
        System.out.print((c)+" ");
       	temp=c;
        a=b;
        b=temp;
         x=x+1;
        
      }
	}
}
