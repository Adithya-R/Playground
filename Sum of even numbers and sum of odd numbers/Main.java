import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       Scanner in=new Scanner(System.in);
      int n= in.nextInt();
      int a[]=new int[n];
      int esum=0,osum=0;
      for(int i=0;i<n;i++)
      {
        a[i]=in.nextInt();
        if(a[i]%2==0 && a[i]>0)
        esum=esum+a[i];
        else
          osum=osum+a[i];
      }
      System.out.println("The sum of the even numbers in the array is "+esum);
      System.out.println("The sum of the odd numbers in the array is "+osum);
    }
}