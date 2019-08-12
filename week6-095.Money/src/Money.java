
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public Money plus(Money added) {
        int euros = this.euros + added.euros;
        int cents = this.cents + added.cents;
        return new Money(euros, cents);
    }
    
    public boolean less(Money compared) {
        if (this.euros < compared.euros) {
            return true;
        } else if (this.euros == compared.euros && this.cents < compared.cents) {
            return true;
        }
        return false;
    }
    
    public Money minus(Money decremented) {
        int euros = this.euros - decremented.euros;
        int cents = 0;
        
        if (this.euros - decremented.euros < 0) {
            //Exit method and return zero valuation
            return new Money(0,0);
        }
        
        if ((this.cents - decremented.cents) < 0) {
            euros--;
            cents = 100 - decremented.cents;
        }
        
        return new Money(euros, cents);
    }
    
    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

}
