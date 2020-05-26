import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
      int a=in.nextInt();
      int n=in.nextInt();
      System.out.printf("The value of %d power %d is %d",a,n,power(a,n));
    }
  public static int power(int a,int n)
{
    int c=n;
 if(n==0)
    return 1;
else if(n>1)
	return a*power(a,n-1);
 else
    return a;
 }
}