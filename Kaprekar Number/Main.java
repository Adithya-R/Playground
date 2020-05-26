import java.util.Scanner;
import java.lang.Math.*;
class Main
{
    public static void main(String args[])
    {
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int p=n*n,c=0,n1=0,s;
      int temp=p;
      while(temp>0)
      {
          c++;
        temp=temp/10;
      }
      int i=1,x=0;
      temp=p;
      while(p>0)
      {
        n1=temp%(int)Math.pow(10,i);
        p=p/10;
        i++;
        if(p+n1==n && p>0 && n1>0){
            System.out.println("Kaprekar Number");
            x=1;
            break;}
      }
      if(x==0)
      System.out.println("Not a Kaprekar Number");
    }
}