import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int n= in.nextInt();
    int a[]=new int[n];
     int c=1;
      for(int i=0;i<n;i++)
      {
        a[i]=in.nextInt();
      }
     int ele=in.nextInt();
       if (ele>=n)
    {
      System.out.println("Invalid Input");
      return ;
    }
    System.out.println("Array after deletion is");
      for(int j=0;j<n;j++)
      {
        if(j+1!=ele)
          System.out.println(a[j]);           
      }
  }
}