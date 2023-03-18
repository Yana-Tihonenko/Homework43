public class PrivateHouse extends House {

    public PrivateHouse(String address) {
        super(address);
    }

    @Override
    public String toString() {
        return String.format("Private House, address %s", address);
    }
}
