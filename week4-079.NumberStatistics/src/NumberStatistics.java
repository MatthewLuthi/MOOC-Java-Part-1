
import java.util.ArrayList;

public class NumberStatistics {
    private int amountOfNumbers;
    private ArrayList<Integer> numbers;
    
    public NumberStatistics() {
        amountOfNumbers = 0;
        numbers = new ArrayList<Integer>();
    }
    
    public void addNumber(int number) {
       numbers.add(number);
       amountOfNumbers++;
    }
    
    public int amountOfNumbers() {
        return amountOfNumbers;
    }
    
    public int sum() {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        } 
        return sum;
    }
    
    public double average() {
        if (sum() > 0) {
            return sum() / (double) amountOfNumbers;
        }
        return 0;
    }
}
