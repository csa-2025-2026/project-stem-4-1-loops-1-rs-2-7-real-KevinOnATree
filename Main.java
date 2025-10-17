import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    System.out.println("Which Problem?");
    Scanner Pc = new Scanner(System.in);
    int Prc = Pc.nextInt();


    if (Prc == 1) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter any numbers (Enter -1 to stop)");
      int blah = sc.nextInt();
      int sum = 0;
     

     while (blah >= 0) {
      sum += blah;
      blah = sc.nextInt();
      
     }
     System.out.println("Sum is " + sum );


  } else if (Prc == 2) {

    Scanner sc1 = new Scanner(System.in);
     System.out.println("Enter the Scores: (Enter -1 to stop)");
      int blah2 = sc1.nextInt();
      int former;
      int max;
       boolean ifthat = true;
     while (ifthat) {

      blah2 = sc1.nextInt();
      former = blah2;
      max = Math.max(former, blah2);


      if (blah2 == -1) {
        ifthat = false;
      }
     }
     System.out.println("The largest score is " + max);
  }










  } 
}
