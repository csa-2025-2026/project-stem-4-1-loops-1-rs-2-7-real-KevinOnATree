import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    System.out.println("Which Problem?");

    Scanner Pc = new Scanner(System.in);
    int Prc = Pc.nextInt();
    Scanner sc = new Scanner(System.in);

    if (Prc == 1) {
     System.out.println("Enter any numbers (Enter -1 to stop)");
      int blah = sc.nextInt();
      int sum = 0;
     

     while (blah >= 0) {
      sum += blah;
      blah = sc.nextInt();
      
     }
     System.out.println("Sum is " + sum );


  } else if (Prc == 2) {
     System.out.println("Enter the Scores: (Enter -1 to stop)");
      int blah2 = sc.nextInt();
      int former = 0;
      boolean ifthat = true;
      while (ifthat) {

      blah2 = sc.nextInt();
      former = Math.max(former, blah2);


      if (blah2 == -1) {
        ifthat = false;
      }
     }
     System.out.println("The largest score is " + former);
  } else if (Prc == 3) {
    System.out.println("Input a word: ");
    String thirdw = sc.nextLine();
    int i1 = 0;
    String final1 = "";
    while (i1 < thirdw.length() ) {
      final1 += thirdw.substring(i1, Math.min(thirdw.length(), i1 + 2));
      i1 +=3;

    }
    System.out.println(final1);
  }










  } 
}
