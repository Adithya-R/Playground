import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      System.out.printf("The factorial of %d is %d",n,fact(n));
    }
  public static int fact(int n)
{
 if(n==0 || n==1)
    return 1;
else 
return n*fact(n-1);
 }
}