import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner in =new Scanner(System.in);
      int bl,vi,au,ar,le;
      bl=in.nextInt();
      vi=in.nextInt();
      au=in.nextInt();
      ar=in.nextInt();
      le=in.nextInt();
      double cost=(bl*350.34)+(vi*230.9)+(au*190.55)+(ar*125.3)+(le*180.9);
      if(cost<=15000)
        System.out.println("Yes");
      else
        System.out.println("No");
	}
}