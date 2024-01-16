package week3_day1;

class Vehicle {
    String make;
    String model;
    int year;
    int maximumSpeed;

    // Constructor for the Vehicle class
    public Vehicle(String make, String model, int year, int maximumSpeed) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.maximumSpeed = maximumSpeed;
    }

    // Method to simulate driving for the Vehicle class
    public void drive() {
        System.out.println("Vehicle is driving");
    }
}

class Car extends Vehicle {
    // Constructor for the Car class, calling the superclass constructor using super()
    public Car(String make, String model, int year, int maximumSpeed) {
        super(make, model, year, maximumSpeed);
    }

    // Override the drive method for the Car class
    public void drive() {
        System.out.println(make + " " + model + " Car is driving");
    }
}

class Bike extends Vehicle {
    // Constructor for the Bike class, calling the superclass constructor using super()
    public Bike(String make, String model, int year, int maximumSpeed) {
        super(make, model, year, maximumSpeed);
    }

    // Override the drive method for the Bike class
    public void drive() {
        System.out.println(make + " " + model + " Bike is driving");
    }
}

public class main {
    public static void main(String[] args) {
        // Create an instance of the Car class
        Car myCar = new Car("Mahindra", "Thar", 2020, 200);

        // Create an instance of the Bike class
        Bike myBike = new Bike("Nissan", "GTR", 2021, 500);

        // Print attributes and drive for Car
        System.out.println("Car Details:");
        System.out.println("Make: " + myCar.make);
        System.out.println("Model: " + myCar.model);
        System.out.println("Year: " + myCar.year);
        System.out.println("Maximum Speed: " + myCar.maximumSpeed + " km/h");

        // Drive the Car
        myCar.drive();

        System.out.println(); // Blank line for separation

        // Print attributes and drive for Bike
        System.out.println("Bike Details:");
        System.out.println("Make: " + myBike.make);
        System.out.println("Model: " + myBike.model);
        System.out.println("Year: " + myBike.year);
        System.out.println("Maximum Speed: " + myBike.maximumSpeed + " km/h");

        // Drive the Bike
        myBike.drive();
    }
}
