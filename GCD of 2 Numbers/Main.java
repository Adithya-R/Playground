import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
      int a=in.nextInt();
      int b=in.nextInt();
      System.out.printf("G.C.D of %d and %d is %d",a,b,gcd(a,b));
    }
  public static int gcd(int a,int b)
{
    
 if(b!=0)
    return gcd(b,a%b);

 else
    return a;
 }
}