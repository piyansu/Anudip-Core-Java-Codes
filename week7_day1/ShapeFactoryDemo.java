package week7_day1 ;

// Shape interface
interface Shape {
    // Method to draw the shape
    void draw();
}

// Concrete Circle class
class Circle implements Shape {
    // Implementation of draw method for Circle
    @Override
    public void draw() {
        System.out.println("I am a Circle");
    }
}

// Concrete Square class
class Square implements Shape {
    // Implementation of draw method for Square
    @Override
    public void draw() {
        System.out.println("I am a Square");
    }
}

// Concrete Triangle class
class Triangle implements Shape {
    // Implementation of draw method for Triangle
    @Override
    public void draw() {
        System.out.println("I am a Triangle");
    }
}

// ShapeFactory class
class ShapeFactory {
    // Method to create a shape based on the input string
    public Shape createShape(String shapeType) {
        switch (shapeType) {
            case "circle":
                return new Circle();
            case "square":
                return new Square();
            case "triangle":
                return new Triangle();
            default:
                throw new IllegalArgumentException("Invalid shape type: " + shapeType);
        }
    }
}

// Main program to demonstrate the usage of the factory
public class ShapeFactoryDemo {
    public static void main(String[] args) {
        // Create an instance of ShapeFactory
        ShapeFactory shapeFactory = new ShapeFactory();

        // Create different shapes using the factory
        Shape circle = shapeFactory.createShape("circle");
        Shape square = shapeFactory.createShape("square");
        Shape triangle = shapeFactory.createShape("triangle");

        // Call draw method for each shape
        circle.draw();
        square.draw();
        triangle.draw();
    }
}
