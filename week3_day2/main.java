package week3_day2;

//Abstract class Shape
abstract class Shape {
 // Abstract method to calculate area
 abstract double calculateArea();
}

//Concrete subclass Circle extending Shape
class Circle extends Shape {
 private double radius = 5;
 
 // Implementation of calculateArea for Circle
 double calculateArea() {
     return Math.PI * radius * radius;
 }
}

//Concrete subclass Rectangle extending Shape
class Rectangle extends Shape {
 private double length = 4;
 private double width = 6;

 // Implementation of calculateArea for Rectangle
 double calculateArea() {
     return length * width;
 }
}

//Main class to demonstrate the usage
public class main {
 public static void main(String[] args) {
     // Create instances of Circle and Rectangle
     Circle c1 = new Circle();
     Rectangle r1 = new Rectangle();

     // Calculate and print areas
     System.out.println("Area of Circle: " + c1.calculateArea());
     System.out.println("Area of Rectangle: " + r1.calculateArea());
 }
}

