package week6_day4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConcatenateStrings {
    public static void main(String[] args) {
        // Sample list of strings
        List<String> stringList = Arrays.asList("My ","Name ", "is " , "Piyansu ");

        // Use Stream API to concatenate strings
        String concatenatedString = stringList.stream()
                .collect(Collectors.joining());

        // Print the result
        System.out.println("Original List: " + stringList);
        System.out.println("Concatenated String: " + concatenatedString);
    }
}

