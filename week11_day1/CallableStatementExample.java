package week11_day1;

import java.sql.*;

public class CallableStatementExample {

    // JDBC URL, username, and password of MySQL server
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/anudip";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "Piyansu@2002";

    public static void main(String[] args) {
        try {
            // Register MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish Connection
            Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);

            // Call the stored procedure
            String instructorName = "Piyansu Saha"; // Change this to the instructor you want to query
            callStoredProcedure(connection, instructorName);

            // Close Connection
            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
    
    private static void callStoredProcedure(Connection connection, String instructorName) throws SQLException {
        try {
            // Prepare and execute the stored procedure call
            String sql = "{CALL GetInstructorFeedback(?)}"; // The stored procedure call
            CallableStatement callableStatement = connection.prepareCall(sql);
            callableStatement.setString(1, instructorName); // Set the input parameter
            ResultSet resultSet = callableStatement.executeQuery(); // Execute the query

            // Process the result set
            while (resultSet.next()) {
                String feedback = resultSet.getString("feedback"); // Get feedback from the result set
                System.out.println("Feedback for " + instructorName + ": " + feedback); // Print feedback
            }

            // Close resources
            resultSet.close(); // Close the result set
            callableStatement.close(); // Close the callable statement
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
