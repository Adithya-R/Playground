import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
      int items=in.nextInt();
      float time=in.nextFloat();
      if(items==2)
      {
        time=time+(time)/2;
        System.out.println(time);
      }
      
      else if(items==3)
      {
        time=2*time;
         System.out.println(time);
      }
      else
         System.out.println("Number of items is more");
        
	}
}