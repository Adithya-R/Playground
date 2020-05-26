import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       Scanner in = new Scanner(System.in);
      char ch =in.next().charAt(0);
      
      if((ch>=65 && ch<=90) || (ch>=97 && ch<=122) )
      {
        if(ch==65 || ch==69 || ch==73 || ch==79 || ch==85 || ch==97 || ch==101 || ch==105 || ch==111 || ch==117)
         System.out.println("Vowel");
        else
          System.out.println("Consonant");
      }
      else
      {
        System.out.println("Not an alphabet");
      }
    }
}