public class Apartment {
    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;
    private int difference;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter){
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
        this.price = squareMeters * pricePerSquareMeter;


    }

    public boolean larger(Apartment otherApartment){
        return this.squareMeters>otherApartment.squareMeters;
    }
    private int price(){
        return pricePerSquareMeter*squareMeters;
    };

    public int priceDifference(Apartment otherApartment) {
        return Math.abs(this.price()-otherApartment.price());
    }
    public boolean moreExpensiveThan(Apartment otherApartment){
        return this.price()>otherApartment.price();
    }


    public static void main(String[] args) {
        Apartment studioManhattan = new Apartment(1, 16, 5500);
        Apartment twoRoomsBrooklyn = new Apartment(2, 38, 4200);
        Apartment fourAndKitchenBronx = new Apartment(3, 78, 2500);

        System.out.println( studioManhattan.priceDifference(twoRoomsBrooklyn) );        // 71600
        System.out.println( fourAndKitchenBronx.priceDifference(twoRoomsBrooklyn) );    // 35400
    }

}







