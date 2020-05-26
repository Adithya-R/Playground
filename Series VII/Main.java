import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      double a=3.0;
      double b=2.0;
      for (int i=1;i<=n;i++)
      {
        if(i%2!=0)
        {
          if(i==1)
            System.out.print(1+" ");
          else{
        	System.out.print(a+" ");
         	a=a*3;
          }
      }
        else
        {
          System.out.print(b+" ");
          b=b*3;
      }
          
        
      }
	}
}