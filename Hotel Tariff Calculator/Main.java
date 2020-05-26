import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
	  Scanner in = new Scanner(System.in);
	int mon =in.nextInt();
	int rent =in.nextInt();
      int days=in.nextInt();
		switch(mon)
        {
      case 1:
      case 2:
      case 3:
      case 7:
      case 8:
      case 9:
      case 10:
      System.out.println(rent*days);
      break;
      case 4:
      case 5:
      case 6:
      case 11:
      case 12:
      System.out.println(rent*days+(rent*days)/5);
            break;
      default:
      System.out.println("Invalid Input");
    }

	}
}