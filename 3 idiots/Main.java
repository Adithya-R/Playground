import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
	int x1 =in.nextInt();
	int y1 =in.nextInt();
    int x2 =in.nextInt();
	int y2 =in.nextInt();
    float x=(float)(x1+x2)/2;
    float y=(float)(y1+y2)/2;
	System.out.printf("Binoy's house is located at (%.1f,%.1f)",x,y);
  }
}