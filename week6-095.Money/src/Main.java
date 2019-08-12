
public class Main {

    public static void main(String[] args) {
        Money a = new Money(10,0);
        Money b = new Money(3,99);
        Money c = b.minus(a);
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
