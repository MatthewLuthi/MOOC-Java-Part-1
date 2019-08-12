
public class Main {

    public static void main(String[] args) {
        MyDate date = new MyDate(1, 1, 2010);
        System.out.println(date);
        date.advance(30);
        System.out.println(date);
    }
}
