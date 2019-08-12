import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInReverseOrder {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();
        String word = "";
        
        do {
            word = reader.nextLine();
            list.add(word);
            
        } while (!word.isEmpty());
        
        System.out.println("You typed the following words: ");
        
        Collections.reverse(list);
        
        for (String text : list) {
            System.out.println(text);
        }
    }
}
