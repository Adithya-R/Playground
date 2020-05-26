import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       Scanner in=new Scanner(System.in);
      int n= in.nextInt();
      int arr[]=new int[n];
      int max=0;
      for(int i=0;i<n;i++)
      {
        arr[i]=in.nextInt();
        if(arr[i]>=max)
          max=arr[i];
      }
      System.out.println(max+" is the maximum element in the array");
        
    }
}