import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      System.out.printf("The sum of digits in %d is %d",n,sumd(n));
    }
  public static int sumd(int n)
{
    int sum=0;
    sum=n%10;
 if(n==0)
    return 0;

 else
    return sum+sumd(n/10);
 }
}