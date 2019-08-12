
public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        int counter = 0;
        while (counter < amount) {
            System.out.print("*");
            counter++;
        }
        System.out.println();
    }

    public static void printWhitespaces(int amount) {
        int counter = 0;

        while (counter < amount) {
            System.out.print(" ");
            counter++;
        }
    }

    public static void printTriangle(int size) {
        int i = size - 1;
        int counter = 1;
        while (i >= 0) {
            printWhitespaces(i);
            printStars(counter);
            i--;
            counter++;
        }
    }

public static void xmasTree(int height) {
        int i = height - 1;
        int nStars = 1;
        
        while (i >= 0) {
            printWhitespaces(i);
            printStars(nStars);
            nStars += 2;
            i--;
        }

        int counter = 0;
        while (counter < 2) {
            printWhitespaces(height - 2);
            printStars(3);
            counter++;
        }
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
