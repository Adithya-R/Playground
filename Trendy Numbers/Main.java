import java.util.*;
public class Main
{
    public static void main(String[] a)
    {
        Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int temp=n;
		int n1,s=0,c=0;
		while(n>0)
		{
			n1=n%10;
          
			s=s*10+n1;
			n=n/10;
          c++;
		}
		if(c==3 && ((temp/10)%10)%3==0)
			System.out.println("Trendy Number");
      else
        System.out.println("Not a Trendy Number");
		
    }
}
 
