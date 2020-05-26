import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       Scanner in=new Scanner(System.in);
      int n= in.nextInt();
      int a[]=new int[n];
      int b[]=new int[n];
      int sum=0;
      for(int i=0;i<n;i++)
      {
        a[i]=in.nextInt();
      }
      for(int j=0;j<n;j++)
      {
        b[j]=in.nextInt();
        sum=a[j]+b[j];
        System.out.println(sum);
      }
 
      
        
    }
}