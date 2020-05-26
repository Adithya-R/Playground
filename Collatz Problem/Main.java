
import java.util.Scanner;
class Main
{
public static void main(String args[])
{
// fill your code
      Scanner in=new Scanner(System.in);
      int n= in.nextInt();
      int c=0;
     while(n>=1)
      {
            if(n==1){
       	System.out.println(n);
        break;
     }
       System.out.println(n); 
       if(n%2==0 )
       {
         n=n/2;
        c++;
       }
        else 
        {
          n=3*n+1; 
          c++;
        }
      }
      System.out.println(c);
}
}