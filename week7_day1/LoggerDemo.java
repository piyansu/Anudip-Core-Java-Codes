package week7_day1;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

// Logger class using Singleton Pattern
class Logger {
    // Singleton instance
    private static Logger instance;

    // File to log messages
    private PrintWriter logFile;

    // Private constructor to prevent instantiation outside the class
    private Logger() {
        try {
            // Initialize the log file
            logFile = new PrintWriter(new FileWriter("application_log.txt", true), true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Method to get the singleton instance of Logger
    public static Logger getInstance() {
        if (instance == null) {
            // If no instance exists, create one
            instance = new Logger();
        }
        return instance;
    }

    // Method to log a message
    public void log(String message) {
        // Log the message to the file
        logFile.println(message);
    }
}

// Main program to demonstrate the usage of the Logger class
public class LoggerDemo {
    public static void main(String[] args) {
        // Get the singleton instance of Logger
        Logger logger = Logger.getInstance();

        // Log messages from multiple parts of the application
        logger.log("Message from Part 1");
        logger.log("Message from Part 2");
        logger.log("Message from Part 3");
    }
}
