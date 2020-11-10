package data;

import base.Bike;
import base.Location;
import base.Parcel;
import base.ParcelStatus;
import base.Person;

public class ToyData {

    public static Bike[] getBikes() {
        Bike[] bikes = new Bike[3];
        bikes[0] = new Bike("a001",500);
        bikes[1] = new Bike("b002",650);
        bikes[2] = new Bike("c003",900);

        return bikes;
    }

    public static Person[] getPerson() {
        Person[] person = new Person[3];
        person[0] = new Person("Wongsakorn", "Saengsurasak");
        person[1] = new Person("Pattera", "Jongwatananugul");
        person[2] = new Person("Titima", "Nakkham");

        return person;
    }

    public static Parcel[] getParcels() {
        Parcel[] parcels = new Parcel[10];
        parcels[0] = new Parcel(50, ParcelStatus.SHIPPING, new Location(120, 246));
        parcels[1] = new Parcel(40, ParcelStatus.DELIVERED, new Location(10, 306));
        parcels[2] = new Parcel(35, ParcelStatus.READY_TO_SHIP, new Location(120, 246));
        parcels[3] = new Parcel(22, ParcelStatus.READY_TO_SHIP, new Location(120, 246));
        parcels[4] = new Parcel(13, ParcelStatus.SHIPPING, new Location(120, 246));
        parcels[5] = new Parcel(29, ParcelStatus.SHIPPING, new Location(120, 246));
        parcels[6] = new Parcel(65, ParcelStatus.READY_TO_SHIP, new Location(120, 246));
        parcels[7] = new Parcel(43, ParcelStatus.DELIVERED, new Location(120, 246));
        parcels[8] = new Parcel(70, ParcelStatus.SHIPPING, new Location(120, 246));
        parcels[9] = new Parcel(59, ParcelStatus.SHIPPING, new Location(120, 246));

        return parcels;
    }

    //testing
    public static void main(String[] args) {
        printBike();
        printPerson();
        printParcels();
    }

    private static void printBike() {
        Bike[] bikes = getBikes();
        for (int i = 0; i < bikes.length; i++) {
            System.out.println(bikes[i].toString());
        }
    }

    private static void printPerson() {
        Person[] person = getPerson();
        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i].toString());
        }
    }

    private static void printParcels() {
        Parcel[] percels = getParcels();
        for (int i = 0; i < percels.length; i++) {
            System.out.println(percels[i].toString());
        }
    }

}
