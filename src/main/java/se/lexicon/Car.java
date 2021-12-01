package se.lexicon;

/**
 * Car class (BluePrint)
 * Instructions on fields and attributes for a car.
 */

public class Car {

    //fields
    String brand;
    String model;
    int productionYear;
    String regNumber;
    String color;
    String gearbox;

    //function | method
    public String getInformation(){
        return "Car {" + "Brand: " + brand +" Model: "+ model +" ProductionYear: " + productionYear +
                "  RegNumber: " + regNumber +" Color: " + color + " GearBox " + gearbox + "}";
    }

}
