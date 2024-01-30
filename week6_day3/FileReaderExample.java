package week6_day3;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
    public static void main(String[] args) {
        // Create a File object representing the file path
        File myFile = new File("C:\\Users\\piyan\\eclipse-workspace\\Anudip\\src\\week6_day3\\Piyansu.txt");

        try {
            // Create a FileReader object to read from the file
            FileReader fileReader = new FileReader(myFile);

            int character;
            int charCount = 0;

            // Read characters from the file using FileReader.read()
            while ((character = fileReader.read()) != -1) {
                // Process each character
                System.out.print((char) character);
                charCount++;
            }

            // Print the total number of characters
            System.out.println("\nTotal number of characters: " + charCount);

            // Close the FileReader to release resources
            fileReader.close();

        } catch (IOException e) {
            // Handle IOException if reading from the file fails
        	System.out.println("File Not Found");
        }
    }
}
