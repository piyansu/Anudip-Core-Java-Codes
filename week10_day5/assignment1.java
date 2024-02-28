package week10_day5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class assignment1 {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/anudip";
        String user = "root";
        String password = "Piyansu@2002";

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            String sql = "SELECT * FROM student";
            Statement statement = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet resultSet = statement.executeQuery(sql);

            System.out.println("Displaying records from the ResultSet:");
            System.out.println("=======================================");

            // Move to the last row to get the total number of rows
            resultSet.last();
            int rowCount = resultSet.getRow();
            resultSet.beforeFirst(); // Move back to the beginning

            System.out.println("Total number of records: " + rowCount);
            System.out.println("");

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");

                System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
