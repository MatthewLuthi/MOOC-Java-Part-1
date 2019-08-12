
import java.util.ArrayList;
import java.util.Scanner;

public class RecurringWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here the ArrayList 
        ArrayList<String> words = new ArrayList<String>();
        
        int counter = 0;
        
        while (counter < 1) {
            System.out.print("Type a word: ");
            String word = reader.nextLine();

            if (words.contains(word)) {
                counter++;
            }
            
            words.add(word);
        }
        
        System.out.println("You gave the word "+words.get(words.size()-1)+" twice");
    }
}
