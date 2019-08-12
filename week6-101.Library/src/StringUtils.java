/**
 * Class to help search functionality be more flexible
 * to include upper and lower case as well as negate extra whitespace
 * @author Mxtt Offline
 */
public class StringUtils {
    public static boolean included(String word, String searched) {
        if (word == null || searched == null) {
            return false;
        }
        word = word.toUpperCase();
        searched = searched.trim(); //trim string so no extra whitespace
        searched = searched.toUpperCase();//change to all uppercase
       
        if (word.contains(searched)) {
            return true;
        }
        return false;
    }
}
