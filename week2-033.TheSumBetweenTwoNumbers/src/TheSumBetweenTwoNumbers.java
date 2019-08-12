
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("First: ");
        int lowerBound = reader.nextInt();
        
        System.out.print("Last: ");
        int upperBound = reader.nextInt();
        int sum = 0;
        
        while (lowerBound <= upperBound) {
            sum += lowerBound;
            lowerBound++;
        }
        
        System.out.println("The sum is "+sum);
    }
}
