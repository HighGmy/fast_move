package data;

import base.Bike;
import base.Parcel;
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
        // your code

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
