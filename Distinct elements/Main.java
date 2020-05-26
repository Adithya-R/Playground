import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       Scanner in=new Scanner(System.in);
      int n= in.nextInt();
      int a[]=new int[n];
      int j,i,k,c=0;
      for(i=0;i<n;i++)
      {
        a[i]=in.nextInt();  
      }
      for(j=0;j<n;j++)
      {
        for(k=j+1;k<n;k++)
        {
          if(a[j]==a[k]){
            c++;
          break;}
        }
      }
      System.out.println(n-c);
    }
}