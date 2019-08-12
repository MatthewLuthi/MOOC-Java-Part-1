
import java.util.Scanner;

public class Adder {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Implement your program here. Remember to ask the input from user
        System.out.print("Type a number: ");
        int x = Integer.parseInt(input.nextLine());
        
        System.out.print("Type another number: ");
        int y = Integer.parseInt(input.nextLine());
        
        System.out.println("Sum of the numbers: "+(x+y));
    }
}
