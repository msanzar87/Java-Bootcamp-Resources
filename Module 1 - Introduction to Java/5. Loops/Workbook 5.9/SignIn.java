import java.util.Scanner;

public class SignIn {
    public static void main(String[] args) {
        String username = "Munir";
        String password = "Java";
        
        /* Task 1 
            1. Pick up a username and password from the user.
       */
        Scanner scan = new Scanner(System.in);
        System.out.println("\nWelcome to Javagram! Sign in below\n");
        System.out.print("• Username: ");
        String usernameEntry = scan.nextLine();
        //pick up username
        System.out.print("• Password: ");
        String passwordEntry = scan.nextLine();
        //pick up password

        while (!usernameEntry.equals(username) || !passwordEntry.equals(password)){
            System.out.println("\nIncorrect, please try again!\n");
            System.out.print("• Username: ");
            usernameEntry = scan.nextLine();
            System.out.print("• Password: ");
            passwordEntry = scan.nextLine();
        }
        System.out.println("\nSign in successful. Welcome!");
        /* Task 2 
            1. Set up a loop that keeps running while the username OR password is incorrect. 
               When they get it wrong:
                •  println: \nIncorrect, please try again!\n
                •  get them to enter their username and password again
            2. After they enter the correct information, print: 
                   \nSign in successful. Welcome!
       */

        scan.close();

        
    }
}
