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

    public void displayInfo(){
        System.out.println(getColor());
        System.out.println(getEngineSize());
        System.out.println(getFuelType());
        System.out.println(getNumberOfWheels());
        System.out.println(getBrand());
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
