import java.util.Scanner;

public class CounterTool {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("I hear you like to count by threes\n");
        System.out.println("Jimmy: It depends.");
        System.out.println("Oh, ok...");

        System.out.print("1. Pick a number to count by: ");
        int cBy = scan.nextInt();

        System.out.print("2. Pick a number to start counting from: ");
        int cFrom = scan.nextInt();

        System.out.print("3. Pick a number to count to: ");
        int cTo = scan.nextInt();

      /* Task 1 – Get integers from the user.


          1.   print : Pick a number to count by:
               pick up the user's answer
        
          2.   print : Pick a number to start counting from:
               pick up the user's answer

          3.    print : Pick a number to count to:
                pick up the user's answer 
                
        */

        for (int i = cFrom; i <= cTo; i+=cBy) {
            System.out.print(i + " ");

        }
      /* Task 2 – Create a for loop that:
            1. starts from the second number.
            2. stops at the third number. 
            3. counts in steps of the first.
      */

        scan.close();
    }
}
