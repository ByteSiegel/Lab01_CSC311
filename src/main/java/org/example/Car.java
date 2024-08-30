package org.example;
//extends the Vehicle class
public class Car extends Vehicle{
private String brand;
    //constructor
    public Car(){
        super();
        this.brand="";
    }
    //method to honk the horn
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

    //getter and setter for the brand attribute
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
