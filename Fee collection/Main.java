import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
      String st=in.next();
	int t =in.nextInt();
	int b =in.nextInt();
    int h =in.nextInt();
      
      switch(st) {
  case "MSH":
    System.out.println(t+h);
    break;
  case "MSDS":
    System.out.println(t+b);
    break;
     case "MGSDS":
    System.out.println(t+b+(t)/2);
    break;
     case "MGSH":
    System.out.println(t+h+(t)/2);
    break;
  default:
          System.out.println("Invalid");
    
}
      
    }
}