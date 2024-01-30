package week6_day5;

//Functional interface for string manipulation operations
interface StringOperation {
 String operate(String input);
}

//Main class for the string manipulator program
public class StringManipulator {
 public static void main(String[] args) {
     // Lambda expressions for string manipulation
     StringOperation toUpperCase = str -> str.toUpperCase();
     StringOperation toLowerCase = str -> str.toLowerCase();
     StringOperation reverseString = str -> {
         StringBuilder reversed = new StringBuilder(str);
         return reversed.reverse().toString();
     };

     // Example string to manipulate
     String inputString = "My name is PIYANSU SAHA";

     // Applying the lambda expressions
     System.out.println("Original String: " + inputString);
     System.out.println("Uppercase: " + toUpperCase.operate(inputString));
     System.out.println("Lowercase: " + toLowerCase.operate(inputString));
     System.out.println("Reversed: " + reverseString.operate(inputString));
 }
}

