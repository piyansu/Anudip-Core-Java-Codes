package week6_day4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {
    public static void main(String[] args) {
        // Sample list of footballer names with duplicates
        List<String> footballerList = Arrays.asList("Messi", "Ronaldo", "Neymar", "Messi", "Mbappe", "Ronaldo", "Neymar");

        // Use Stream API to remove duplicates
        List<String> uniqueFootballers = footballerList.stream()
                .distinct()
                .collect(Collectors.toList());

        // Print the result
        System.out.println("Original List: " + footballerList);
        System.out.println("List with Duplicates Removed: " + uniqueFootballers);
    }
}

