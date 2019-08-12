
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // write your code here
        System.out.print("First: ");
        int first = reader.nextInt();
        
        System.out.print("Last: ");
        int last = reader.nextInt();
        
        while (first <= last) {
            System.out.println(first);
            first++;
        }
    }
}
