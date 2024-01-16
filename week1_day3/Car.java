package week1_day3;

import java.util.Scanner;

public class Car {

    // Attributes
    private String make;
    private String model;
    private short year;
    private int price;

    // Constructor
    public Car(String make, String model, short year, int price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    // Getter methods
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public short getYear() {
        return year;
    }

    public int getPrice() {
        return price;
    }

    public static void main(String[] args) {
        // Creating Scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Getting input from the user to create a Car object
        System.out.println("Enter car details:");
        System.out.print("Make: ");
        String make = scanner.next();

        System.out.print("Model: ");
        String model = scanner.next();

        System.out.print("Year: ");
        short year = scanner.nextShort();

        System.out.print("Price: ");
        int price = scanner.nextInt();

        // Creating a Car object using the provided input
        Car myCar = new Car(make, model, year, price);

        // Displaying the details of the created Car object
        System.out.println("\nCar Details:");
        System.out.println("Make: " + myCar.getMake());
        System.out.println("Model: " + myCar.getModel());
        System.out.println("Year: " + myCar.getYear());
        System.out.println("Price: $" + myCar.getPrice());

        // Closing the Scanner
        scanner.close();
    }
}

