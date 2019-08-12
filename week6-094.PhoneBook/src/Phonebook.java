
import java.util.ArrayList;

public class Phonebook {
   private ArrayList<Person> book;
   
   public Phonebook() {
       book = new ArrayList<Person>();
   }
   
   public String searchNumber(String name) {
       for (Person person : book) {
           if (person.getName() != null && person.getName().contains(name)) {
               return person.getNumber();
           }
       }
       
       return "number not known";
   }
   
   public void add(String name, String number) {
       book.add(new Person(name, number));
   }
   
   public void printAll() {
       for (Person person : book) {
           System.out.println(person);
       }
   }
}
