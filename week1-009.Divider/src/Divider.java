
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");
        float x = Float.parseFloat(reader.nextLine());
        System.out.print("Type another number: ");
        float y = Float.parseFloat(reader.nextLine());
        
        float division = x / y;
        
        System.out.println("Division: "+x+" / "+y+" = "+division);
        // Implement your program here. Remember to ask the input from user.
    }
}
