package week3_day1;

class Shape {
    public double getArea() {
        return 0.0;
    }
}

class Circle extends Shape {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

class Square extends Shape {
    private int length;

    public Square(int length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return length * length;
    }
}

class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }
}

public class main2 {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println("Area of Circle: " + circle.getArea());

        Square square = new Square(4);
        System.out.println("Area of Square: " + square.getArea());

        Rectangle rectangle = new Rectangle(3, 6);
        System.out.println("Area of Rectangle: " + rectangle.getArea());
    }
}

