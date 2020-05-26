import java.util.Scanner;
class Main
{
public static void main(String args[])
{
  Scanner in = new Scanner(System.in);
	int a =in.nextInt();
	int b =in.nextInt();
   int c=(int)a/b;
  int d=a-c*b;
    System.out.println("The number of students in each team is "+c+" and left out is "+d);
  

  
}
}