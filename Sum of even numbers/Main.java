import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       Scanner in=new Scanner(System.in);
      int n= in.nextInt();
      int a[]=new int[n];
      int sum=0;
      for(int i=0;i<n;i++)
      {
        a[i]=in.nextInt();
        if(a[i]%2==0 && a[i]>0)
        sum=sum+a[i];
      }
      System.out.println("The sum of the even numbers in the array is "+sum);
    }
}