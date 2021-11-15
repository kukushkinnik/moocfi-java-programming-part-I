
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared) {
        if (this.squares > compared.squares) {
            return true;
        }
        return false;
    }

    public int priceDifference(Apartment compared) {
        int currentAppartmentPrice = this.princePerSquare * squares;
        int comparedAppartmentPrice = compared.princePerSquare * compared.squares;

        return Math.abs(currentAppartmentPrice - comparedAppartmentPrice);
    }

    public boolean moreExpensiveThan(Apartment compared) {
        int currentAppartmentPrice = this.princePerSquare * squares;
        int comparedAppartmentPrice = compared.princePerSquare * compared.squares;

        if (currentAppartmentPrice > comparedAppartmentPrice) {
            return  true;
        }
        return false;
    }

}
