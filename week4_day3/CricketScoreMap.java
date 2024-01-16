package week4_day3;

import java.util.HashMap;
import java.util.Map;

public class CricketScoreMap {

    public static void main(String[] args) {
        // Creating a Map to store cricketer names and scores
        Map<String, Integer> cricketScoreMap = new HashMap<>();

        // Adding cricketers and their scores to the Map
        cricketScoreMap.put("Virat Kohli", 100);
        cricketScoreMap.put("Rohit Sharma", 75);
        cricketScoreMap.put("Steve Smith", 60);
        cricketScoreMap.put("Kane Williamson", 85);

        // Searching for a batsman name and displaying his score
        String batsmanToSearch = "Rohit Sharma";

        // Check if the batsman name is present in the Map
        if (cricketScoreMap.containsKey(batsmanToSearch)) {
            // Display the score of the specified batsman
            int score = cricketScoreMap.get(batsmanToSearch);
            System.out.println(batsmanToSearch + "'s Score: " + score);
        } else {
            // Batsman not found in the Map
            System.out.println(batsmanToSearch + " not found in the cricket score map");
        }
    }
}

