import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      System.out.printf("The number of digits in %d is %d",n,count(n));
    }
  public static int count(int n)
{
    int c=0;
 if(n==0)
    return c;

 else
    return ++c+count(n/10);
 }
}