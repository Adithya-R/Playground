import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
	int tar =in.nextInt();
      int s=0,c=0;
      while(true)
      {
        int n=in.nextInt();
        s=s+n;
        c++;
        if(s>=tar)
          break;
      }
      System.out.println("The number of turns is "+c);
    }
}