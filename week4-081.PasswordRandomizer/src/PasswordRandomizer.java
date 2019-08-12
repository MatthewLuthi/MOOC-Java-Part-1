import java.util.Random;

public class PasswordRandomizer {
    private int passwordLength;

    public PasswordRandomizer(int length) {
        passwordLength = length;
    }

    public String createPassword() {
        Random randomizer = new Random();
        String password = "";
        
        for (int i = 0; i < passwordLength; i++) {
            password += "abcdefghijklmnopqrstuvwxyz".charAt(randomizer.nextInt(26));
        }
        return password;
    }
}
