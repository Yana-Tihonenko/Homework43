package TaskWithHouse;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<House> houses = new ArrayList<>();
        houses.add(new ApartmentHouse("AAA",4));
        houses.add(new PrivateHouse("AAA"));
        houses.add(new PrivateHouse("BBB"));

        for (House house: houses) {
            System.out.println(house.toString());
        }
        for (House house: houses) {
            System.out.println(house.demolish());
        }

    }
}