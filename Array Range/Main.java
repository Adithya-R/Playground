import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       Scanner in=new Scanner(System.in);
      int n= in.nextInt();
      int arr[]=new int[n];
      int max=0,min=10000;
      for(int i=0;i<n;i++)
      {
        arr[i]=in.nextInt();
        if(arr[i]>=max)
          max=arr[i];
        if(arr[i]<min)
          min=arr[i];
      }
      System.out.println("The range of the array is "+(max-min));
        
    }
}