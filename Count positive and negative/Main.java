import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
           Scanner in = new Scanner(System.in);
      int n=in.nextInt();
      int pc=0,nc=0;
      for(int i=0;i<n;i++)
      {
        int a=in.nextInt();
        if(a>0)
          pc++;
        else
          nc++;
      }
      System.out.printf("Number of positive numbers is %d and the number of negative numbers is %d",pc,nc);
    }
}