import java.util.Scanner;
import java.lang.Math;
class Main
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
      int x1,y1,x2,y2,r1,r2;
      x1=in.nextInt();
      y1=in.nextInt();
      r1=in.nextInt();
      x2=in.nextInt();
      y2=in.nextInt();
      r2=in.nextInt();
      double dis=Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
      if((int)dis==r1+r2)
      System.out.println("Tangential");
      else if((int)dis>r1+r2)
        System.out.println("Do not overlap");
      else
        System.out.println("Overlap");
      
	}
}