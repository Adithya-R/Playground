import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
     Scanner in = new Scanner(System.in);
	int n =in.nextInt();
      int os=0,es=0,n1;
      while(n>0)
      {
        n1=n%10;
        if(n1%2==0)
          es=es+n1;
        else
          os=os+n1;
        n=n/10;    
      }
      if(os==es)
        System.out.println("yes");
      else
        System.out.println("No");
    }
}