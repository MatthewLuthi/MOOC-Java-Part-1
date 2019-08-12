
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);
        BoundedCounter seconds = new BoundedCounter(59);
        BoundedCounter minutes = new BoundedCounter(59);
        BoundedCounter hours = new BoundedCounter(23);
        
        seconds.setValue(50);
        minutes.setValue(59);
        hours.setValue(23);
        
        while (true) {
            System.out.println(hours+":"+minutes+":"+seconds);
            Thread.sleep(1000);
            seconds.next();
            
            if (seconds.getValue() == 0) {
                minutes.next();
            }
            
            if (seconds.getValue() == 0 && minutes.getValue() == 0) {
                hours.next();
            }
        }

        /*
        Code defined to advance clock every second!!
        System.out.print("seconds: ");
        seconds.setValue(reader.nextInt());
        System.out.print("minutes: ");
        minutes.setValue(reader.nextInt());
        System.out.print("hours: ");
        hours.setValue(reader.nextInt());
        
        int i = 0;
        while (i < 121) {
            System.out.println(hours + ":" + minutes + ":" + seconds);
            seconds.next();
            if (seconds.getValue() == 0) {
                minutes.next();
            }
            if (minutes.getValue() == 0 && seconds.getValue() == 0) {
                hours.next();
            }
            i++;
        }
        */
    }
}
