
import java.util.Random;

public class NightSky {
    private double density;
    private int width;
    private int height;
    private int nStars;
    
    public NightSky(double density) {
        this.density = density;
        width = 20;
        height = 10;
        nStars = 0;
    }
    
    public NightSky(int width, int height) {
        density = 0.1;
        this.width = width;
        this.height = height;
        nStars = 0;
    }
    
    public NightSky(double density, int width, int height) {
        this.density = density;
        this.width = width;
        this.height = height;
        nStars = 0;
    }
    
    public void printLine() {
        Random random = new Random();
        double probability = 0;
        
        for (int i = 0; i < width; i++) {
            probability = random.nextDouble();
            //System.out.println(probability);
            if (probability <= density) {
                System.out.print("*");
                nStars++;
            } else {
                System.out.print(" ");
            }
        }
    }
    
    public void print() {
        nStars = 0;
        for (int i = 0; i < height; i++) {
            printLine();
            System.out.println();
        }
    }
    
    public int starsInLastPrint() {
        return nStars;
    }
}
