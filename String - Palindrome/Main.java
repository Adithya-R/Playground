import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
      String s=in.next();
      StringBuilder str=new StringBuilder(s);
      
      String temp=str.reverse().toString();
      if(s.equals(temp))
      System.out.println("Palindrome");
      else
        System.out.println("Not a Palindrome");
        
	}
}