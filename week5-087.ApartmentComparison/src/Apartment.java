
public class Apartment {

    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;
    private int totalPrice;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
        this.totalPrice = squareMeters * pricePerSquareMeter;
    }
    
    public boolean larger(Apartment apartment) {
        if (squareMeters > apartment.squareMeters) {
            return true;
        }
        return false;
    }
    
    public int priceDifference(Apartment otherApartment) {
        return Math.abs(totalPrice - otherApartment.totalPrice);
    }
    
    public boolean moreExpensiveThan(Apartment otherApartment) {
        if (totalPrice > otherApartment.totalPrice) {
            return true;
        }
        return false;
    }
}
