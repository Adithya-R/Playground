import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      System.out.printf("The term %d in the fibonacci series is %d",n,fib(n));
    }
  public static int fib(int n)
{
    
 if(n==1)
    return 0;
  else if(n==2)
    return 1;

 else
    return fib(n-1)+fib(n-2);
 }
}