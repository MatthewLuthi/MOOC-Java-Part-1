
public class Main {

    public static void main(String[] args) {
        CashRegister unicafe = new CashRegister();
        LyyraCard myCard = new LyyraCard(7);
        
        double change = unicafe.payEconomical(10);
        System.out.println("Change: "+change);
       
        boolean succeeded = unicafe.payGourmet(myCard);
        System.out.println("Payment success: "+succeeded);
        succeeded = unicafe.payGourmet(myCard);
        System.out.println("Payment success: "+succeeded);
        succeeded = unicafe.payEconomical(myCard);
        System.out.println("Payment success: "+succeeded);
        
        System.out.println(unicafe);
    }
}

