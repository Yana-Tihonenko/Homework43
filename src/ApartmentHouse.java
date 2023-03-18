public class ApartmentHouse extends House {
    int floor;

    public ApartmentHouse(String address, int floor) {
        super(address);
        this.floor = floor;
    }

    @Override
    public String toString() {
        return String.format("Apartment house, address %s, floor %d", address,floor );
    }
}
