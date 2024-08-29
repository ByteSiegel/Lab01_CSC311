package org.example;

public class Car extends Vehicle{
private String brand;
    public Car(){
        super();
        this.brand="";
    }

    public void honk(){
        System.out.println("Honk, honk!");
    }

    //prints the attributes of the Car including the inherited attributes from Vehicle
    public void displayInfo(){
        System.out.println(getColor());//this prints the getter from the parent class
        System.out.println(getEngineSize());
        System.out.println(getFuelType());
        System.out.println(getNumberOfWheels());
        System.out.println(getBrand());
    }

    //getters and setters
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
