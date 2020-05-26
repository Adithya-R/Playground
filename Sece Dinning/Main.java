import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
      String s=in.next();
      int n=in.nextInt();
      if(n==0)
      {
        if(s.equals("front"))
          System.out.println("Right Handed");
        else
          System.out.println("Left Handed");
      }
      else
      {
        if(s.equals("rear"))
          System.out.println("Right Handed");
        else
          System.out.println("Left Handed");
        
      }
	}
}