
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        NumberStatistics sum = new NumberStatistics();
        NumberStatistics nEven = new NumberStatistics();
        NumberStatistics nOdd = new NumberStatistics();
        System.out.println("Type numbers:");

        int nInput = 0;
        do {
            nInput = reader.nextInt();
            if (nInput != -1) {
                sum.addNumber(nInput);
                
                if ((nInput % 2) == 0) {
                    nEven.addNumber(nInput);
                } else {
                    nOdd.addNumber(nInput);
                }
            }
        } while (nInput != -1);

        System.out.println("sum: "+sum.sum());
        System.out.println("sum of even: "+nEven.sum());
        System.out.println("sum of odd: "+nOdd.sum());
   

        //CONTINUE 79.2 SUM x AVERAGE
        // Remember to remove all the extra code when doing assignments  79.3 and 79.4
        // Define three NumberStatistics objects in your program:
        // The first is used to track the sum of all given numbers.
        // The second takes care of even numbers and the third the odd numbers.
        // The tests does not work if you do not create the objects in the correct order
    }
}
