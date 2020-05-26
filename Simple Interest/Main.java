import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner in = new Scanner(System.in);
	int a =in.nextInt();
	int b =in.nextInt();
      float rate=in.nextFloat();
      float i=rate*a*b/100;
        System.out.println(i);
        
    }
}