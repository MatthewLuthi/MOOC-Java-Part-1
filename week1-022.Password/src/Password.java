
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "carrot"; // Use carrot as password when running tests.

        while (true) {
            System.out.print("Type the password: ");
            String passGuess = reader.nextLine();
            
            if (passGuess.equalsIgnoreCase("carrot")) {
                System.out.println("Right!");
                
                System.out.println("The secret is: uryyb");
                break;
            } else {
                System.out.println("Wrong!");
            }
           
        }
    }
}
