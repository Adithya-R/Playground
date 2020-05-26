import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       Scanner in=new Scanner(System.in);
      int n= in.nextInt();
      int a[]=new int[n];
      int j,i;
      for(i=0;i<n;i++)
      {
        a[i]=in.nextInt();
      }
      int target=in.nextInt();
       for(j=0;j<n;j++)
      {
        if(a[j]==target)
        {
          System.out.println(a[j]+" is present in the array");
          break;
        }
      }
      if(j==n)
        System.out.println(target+" is not present in the array");        
    }
}