
public class LyyraCard {

    private double balance;

    public LyyraCard(double balanceAtStart) {
        balance = balanceAtStart;
    }

    public String toString() {
        return "The card has " + balance + " euros";
    }

    public void payEconomical() {
        if (balance >= 2.50) {
            balance -= 2.50;
        }

    }

    public void payGourmet() {
        if (balance >= 4.0) {
            balance -= 4.0;
        }
    }

    public void loadMoney(double amount) {
        if (amount > 0) {
            if ((balance + amount > 150.0)) {
                balance = 150.0;
            } else {
                balance += amount;
            }
        }
    }
}
