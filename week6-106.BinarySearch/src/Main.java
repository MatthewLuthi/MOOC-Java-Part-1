
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] array = {-3, 2, 3, 4, 7, 8, 12};
        Scanner scanner = new Scanner(System.in);

        System.out.print("Numbers in the array " + Arrays.toString(array));
        System.out.println();

        System.out.print("Enter searched number: ");
        String number = scanner.nextLine();
        System.out.println();

        boolean result = BinarySearch.search(array, Integer.parseInt(number));
        if (result) {
            System.out.println("Value "+number+" is in the array");
        } else {
            System.out.println("Value "+number+" is not in the array");
        }
        
    }
}
