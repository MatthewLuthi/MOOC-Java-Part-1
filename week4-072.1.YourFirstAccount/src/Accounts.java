
import java.util.Scanner;

public class Accounts {

    public static void main(String[] args) {
        Account mattsAccount = new Account("Matt's account", 100.0);
        
        mattsAccount.deposit(20.0);
        System.out.println(mattsAccount);
    }

}
