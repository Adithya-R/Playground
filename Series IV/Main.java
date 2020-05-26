import java.lang.Math; 
import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      double a=0.5;
      for (int i=0;i<n;i++)
      {
        
        System.out.print(a+" ");
        a=a+(Math.pow(3,i));
      }
	}
}