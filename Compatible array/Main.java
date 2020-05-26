import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       Scanner in=new Scanner(System.in);
      int n= in.nextInt();
      int a[]=new int[n];
      int b[]=new int[n];
      int c=1;
      for(int i=0;i<n;i++)
      {
        a[i]=in.nextInt();
      }
      for(int j=0;j<n;j++)
      {
        b[j]=in.nextInt();
        if(a[j]<b[j])
          c=0;
      }
      if(c==0)
        System.out.println("Incompatible");
        else
          System.out.println("Compatible");
    }
}