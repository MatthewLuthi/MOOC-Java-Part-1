
public class Main {

    public static void main(String[] args) {
       // NightSky night = new NightSky(1, 5, 10);
       NightSky night = new NightSky(8, 4);
        night.print();
        System.out.println("Number of stars = "+night.starsInLastPrint());
        System.out.println();
        
        night.print();
        System.out.println("Number of stars = "+night.starsInLastPrint());
    }
}
