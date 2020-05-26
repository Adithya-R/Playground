import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       Scanner in = new Scanner(System.in);
	int a =in.nextInt();
	int b =in.nextInt();
      int c =in.nextInt();
      String s=in.next();
      switch(s)
      {
        case "L1":
      if( b<c)
        System.out.println("L2");
      else
        System.out.println("L3");
       break;
        case "L2":
          if( a<c )
        System.out.println("L1");
         else
        System.out.println("L3");
          break;
        case "L3":
          if(a<b )
        System.out.println("L1");
      else 
        System.out.println("L2");
          break;
      }
     
    }
}