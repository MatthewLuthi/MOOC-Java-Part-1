
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInAlphabeticalOrder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here an ArrayList
        ArrayList<String> list = new ArrayList<String>();
        String word = "";
        
        do {
            System.out.print("Type a word: ");
            word = reader.nextLine();
            
            list.add(word);
            
        } while (!word.isEmpty());
        
        Collections.sort(list);
        for (String text : list) {
            System.out.println(text);
        }
    }
}
