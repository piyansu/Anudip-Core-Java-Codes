package week4_day2;

import java.util.*;

public class HotPotatoGame {
    public static void main(String[] args) {
        // Create a queue to represent the circle of players
        Queue<String> playerQueue = new LinkedList<>();

        // Enqueue player names
        playerQueue.offer("Sumitra Sir");
        playerQueue.offer("Piyansu");
        playerQueue.offer("Joy");
        playerQueue.offer("Sipra");
        playerQueue.offer("Ahana");

        // Create a Random object for simulating randomness
        Random random = new Random();

        // Simulate passing the potato until only one player remains
        while (playerQueue.size() > 1) {

            // Display the current players in the circle
            System.out.println("Current players in the circle: " + playerQueue);

            // Simulate passing the potato by dequeueing and enqueuing randomly
            // Convert the queue to a list for random access
            ArrayList<String> playerList = new ArrayList<>(playerQueue);
            
            // Generate a random index to select the player with the potato
            int randomIndex = random.nextInt(playerList.size());
            
            // Get the player who has the potato
            String currentPlayer = playerList.get(randomIndex);

            // Display the player who has the potato
            System.out.println(currentPlayer + " has the potato.");

            // Remove the player from the circle
            playerList.remove(randomIndex);

            // Clear the original Queue
            playerQueue.clear();

            // Add the updated elements back to the Queue
            playerQueue.addAll(playerList);
        }

        // Display the winner
        System.out.println("\nThe winner is: " + playerQueue.poll());
        System.out.println("--------------------------");
    }
}
