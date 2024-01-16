package week1_day2;

public class Rectangle {

    // Member variables
    private double width;
    private double height;

    // Enum for color
    public enum Color {
        RED, GREEN, BLUE
    }

    // Member variable for box color
    private Color boxColor;

    // Main method
    public static void main(String[] args) {
        // Print the enum Color.BLUE
        System.out.println(Color.BLUE);
    }
}
