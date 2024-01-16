package week2_day3;

class Vehicle {
    void start() {
        System.out.println("Vehicle started.");
    }
}

class Car extends Vehicle {
    void start() {
        System.out.println("Car started.");
    }
}

class Motorcycle extends Vehicle {
    void start() {
        System.out.println("Motorcycle started.");
    }
}

class Garage {
    void serviceVehicle(Vehicle v) {
        v.start(); 
        System.out.println("Vehicle serviced.");
    }
}

public class main {
	public static void main(String[] args) {
		Car c1 = new Car ();
		Motorcycle m1 = new Motorcycle ();
		Garage g1 = new Garage ();
		
		g1.serviceVehicle(c1);
		g1.serviceVehicle(m1);
		
	}
}

