
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<Student>();
        Scanner read = new Scanner(System.in);
        
        String name = "";
        do {
            System.out.print("name:");
            name = read.nextLine();
            if (name.isEmpty()) {
                continue;
            }
            
            System.out.print("student number:");
            String studentNumber = read.nextLine();
            list.add(new Student(name, studentNumber));
        } while (!name.isEmpty());
        
        for (Student student : list) {
            System.out.println(student);
        }
        
        System.out.print("Give search term:");
        String searchTerm = read.nextLine();
        System.out.println("Result:");
        for (Student student : list) {
            if (student.getName().contains(searchTerm)) {
                System.out.println(student);
            }
        }
    }
}
//READ THE MATERIAL THEN RECALL (Try to remember the material). Repeat the process.
//You should like the process, not the product.