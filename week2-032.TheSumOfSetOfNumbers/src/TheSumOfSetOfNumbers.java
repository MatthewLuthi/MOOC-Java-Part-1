
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int i = 1;
        int sum = 0;
        
        System.out.print("Until what? ");
        int input = reader.nextInt();
        
        while (i <= input) {
            sum += i;
            i++;
        }
        
        System.out.println("Sum is "+sum);
    }
}
