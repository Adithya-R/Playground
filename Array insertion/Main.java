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
      int ind=in.nextInt();
     
    if (ind>=n)
    {
      System.out.println("Invalid Input");
      return ;
    }
     int ele=in.nextInt();
      for(int j=0;j<n && ind<n ;j++)
      {
        if(j==ind-1)
          System.out.println(ele);
        System.out.println(a[j]);          
      }
  }
}