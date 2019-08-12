
public class Counter {

    private int startingValue;
    private boolean check;

    public Counter(int startingValue, boolean check) {
        this.startingValue = startingValue;
        this.check = check;
    }

    public Counter(int startingValue) {
        this.startingValue = startingValue;
        check = false;
    }

    public Counter(boolean check) {
        startingValue = 0;
        if (check) {
            this.check = true;
        }
    }

    public Counter() {
        startingValue = 0;
        check = false;
    }

    public int value() {
        return startingValue;
    }

    public void increase() {
        startingValue++;
    }

    public void increase(int increaseAmount) {
        if (increaseAmount > 0) {
            startingValue += increaseAmount;
        }
    }

    public void decrease() {
        if (check) {
            if (startingValue >= 1) {
                startingValue--;
            }
        } else {
            startingValue--;
        }
    }
    
    public void decrease(int decreaseAmount) {
        if (check) {
            
            if ((startingValue - decreaseAmount) < 0) {
                startingValue = 0;
            } else {
                startingValue -= decreaseAmount;
            }
            
            
        } else if (decreaseAmount > 0) {
            startingValue -= decreaseAmount;
        }
    }
}
