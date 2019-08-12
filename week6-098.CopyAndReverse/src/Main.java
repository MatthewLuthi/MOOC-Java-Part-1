
import java.util.Arrays;



public class Main {

    public static void main(String[] args) {
        int[] original = {2, 3, 4, 5};
        int[] copied = reverseCopy(original);
        
        System.out.println("Original: "+Arrays.toString(original));
        System.out.println("Copy: "+Arrays.toString(copied));
    }
    
    public static int[] copy(int[] array) {
        int[] copy = new int[array.length];
        
        for (int i = 0; i < copy.length; i++) {
            copy[i] = array[i];
        }
        
        return copy;
    }
    
    public static int[] reverseCopy(int[] array) {
        int[] copy = new int[array.length];
        
        int counter = 0;
        for (int i = (array.length - 1); i >= 0; i--) {
            copy[counter] = array[i];
            counter++;
        }
        return copy;
    }
}
