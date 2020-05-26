import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++)
      {
        a[i]=in.nextInt();
      }
      array(n,a);
    }
  public static int array(int n,int a[])
{
    int e=0,o=0;
    for(int j=0;j<n;j++)
    {
      if(a[j]%2==0)
        e++;
      else
        o++;
    }
    if(e==n)
      System.out.println("The array is Even");
    else if(o==n)
      System.out.println("The array is Odd");
    else
      System.out.println("The array is Mixed");
    
    return 0;
 }
}