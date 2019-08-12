import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) { 
        Scanner reader = new Scanner(System.in);
        
        int  number = 0;
        int sum = 0;
        int counter = 0;
        float average = 0f;
        int nOdd = 0;
        int nEven = 0;
        
        System.out.println("Type numbers:");
        
        while (number != -1) {
            number = Integer.parseInt(reader.nextLine());
            if (number != -1) {
                  sum += number;
                  counter++;
                  if ((number % 2) == 0) {
                      nEven++;
                  } else {
                      nOdd++;
                  }
            }
        }
        
        average = sum / (float) counter;
        
        System.out.println("Thank you and see you later!");
        System.out.println("The sum is "+sum);
        System.out.println("How many numbers: "+counter);
        System.out.println("Average: "+average);
        System.out.println("Even numbers: "+nEven);
        System.out.println("Odd numbers: "+nOdd);
    }
}
