import java.util.*;
class Main
{
  public static void main(String args[])
  {
   Scanner in=new Scanner(System.in);
      int n= in.nextInt();
      int a[]=new int[n];
      int mid;
      for(int i=0;i<n;i++)
      {
        a[i]=in.nextInt();
      }
		Arrays.sort(a);
		if(n%2!=0)
          System.out.println("The median of the array is "+a[n/2]+".00");
    	else
        {
           mid=a[n/2]+a[(n/2)-1];
          System.out.println("The median of the array is "+mid/2+".00");
        }
  }
}