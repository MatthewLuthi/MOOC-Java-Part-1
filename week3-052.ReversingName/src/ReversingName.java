import java.util.Scanner;

public class ReversingName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = reader.nextLine();
        
        int i = (name.length() - 1);
        
        String nameInverse = "";
        while (i >= 0) {
            nameInverse += name.charAt(i);
            i--;
        }
        
        System.out.println("In reverse order: "+nameInverse);
    }
}
