import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
	int m =in.nextInt();
      int n=in.nextInt();
      int fir,las,s=0,p=1;
      for(int i=m;i<=n;i++)
      {
        
         fir=i/10;
          las=i%10;
        s=fir+las;
        p=fir*las;
        if(s+p==i)
          System.out.println(i);

      }
    }
}