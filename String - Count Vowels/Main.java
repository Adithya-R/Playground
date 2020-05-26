import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
      String a= in.next();
      a=a.toLowerCase();
      int count=0;
      for(int i=0;i<a.length();i++)
      {
        char c=a.charAt(i);
        if(c=='a' ||c=='e' ||c=='i'||c=='o'||c=='u')
          count++;
      }
      System.out.println(count);
	}
}