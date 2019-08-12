
public class Main {

    public static void main(String[] args) {

        MyDate first = new MyDate(3, 7, 2011);
        MyDate second = new MyDate(3, 7, 2011);//3569 (1, 5, 2000)
        //MyDate second = new MyDate(2, 6, 2000); 3600
        first.differenceInYears(second);
        //System.out.println(second + " and "+first+" difference in years: "+second.differenceInYears(first));    
        System.out.println(first+" and "+second+" difference in years: "+first.differenceInYears(second));
    }
}
