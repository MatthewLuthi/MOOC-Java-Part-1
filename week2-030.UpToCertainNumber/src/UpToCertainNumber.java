
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        // Write your code here
        System.out.println("Up to what number? ");
        int userNum = Integer.parseInt(reader.nextLine());
        int increment = 1;
        
        while (increment <= userNum) {
            System.out.println(increment);
            increment++;
        }
    }
}
