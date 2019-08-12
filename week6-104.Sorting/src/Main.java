
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        int[] values = {6, 3, 0, -1, 4};
        //System.out.println(indexOfTheSmallest(values));
    }

    
    public static int smallest(int[] array) {
        int smallest = array[0];
        
        for (int number : array) {
            if (number < smallest) {
                smallest = number;
            }
        }
        
        return smallest;
    }
    
    public static int indexOfTheSmallest(int[] array) {
        int smallest = array[0];
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
                index = i;
            }
        }
        
        return index;
    }
    
    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        int smallest = array[index];
        
        
        for (int i = index; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
                index = i;
            }
        }
        
        return index;
    }
    
    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
    
    public static void sort(int[] array) {
        System.out.println(Arrays.toString(array));
        //int index = indexOfTheSmallestStartingFrom(array, 0);
        //swap(array, 0, index);
        
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            index = indexOfTheSmallestStartingFrom(array, i);
            swap(array, i, index);
            System.out.println(Arrays.toString(array));
        }
    }
}
