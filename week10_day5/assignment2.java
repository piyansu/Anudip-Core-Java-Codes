package week10_day5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class assignment2 {

    public static void main(String[] args) {
    	String url = "jdbc:mysql://localhost:3306/anudip";
        String user = "root";
        String password = "Piyansu@2002";

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            // Create a new table
            createTable(conn);

            // Alter table to add a new column
            alterTable(conn);

            // Insert data into the table
            insertData(conn);

            // Update a record
            updateData(conn);

            // Delete a record
            deleteData(conn);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void createTable(Connection conn) throws SQLException {
        try (Statement statement = conn.createStatement()) {
            String createTableSQL = "CREATE TABLE IF NOT EXISTS employees (" +
                    "id INT PRIMARY KEY," +
                    "name VARCHAR(50)," +
                    "age INT," +
                    "department VARCHAR(50)" +
                    ")";
            statement.executeUpdate(createTableSQL);
            System.out.println("Table 'employees' created successfully.");
        }
    }

    private static void alterTable(Connection conn) throws SQLException {
        try (Statement statement = conn.createStatement()) {
            String alterTableSQL = "ALTER TABLE employees ADD COLUMN salary DECIMAL(10,2)";
            statement.executeUpdate(alterTableSQL);
            System.out.println("Table 'employees' altered to add column 'salary'.");
        }
    }

    private static void insertData(Connection conn) throws SQLException {
        try (Statement statement = conn.createStatement()) {
            String insertSQL = "INSERT INTO employees (id, name, age, department, salary) VALUES " +
                    "(1, 'Alice', 25, 'HR', 50000.00), " +
                    "(2, 'Bob', 30, 'IT', 60000.00), " +
                    "(3, 'Charlie', 22, 'Marketing', 45000.00)";
            int rowsAffected = statement.executeUpdate(insertSQL);
            System.out.println(rowsAffected + " row(s) inserted into 'employees' table.");
        }
    }

    private static void updateData(Connection conn) throws SQLException {
        try (Statement statement = conn.createStatement()) {
            String updateSQL = "UPDATE employees SET salary = 52000.00 WHERE name = 'Alice'";
            int rowsAffected = statement.executeUpdate(updateSQL);
            System.out.println(rowsAffected + " row(s) updated in 'employees' table.");
        }
    }

    private static void deleteData(Connection conn) throws SQLException {
        try (Statement statement = conn.createStatement()) {
            String deleteSQL = "DELETE FROM employees WHERE department = 'Marketing'";
            int rowsAffected = statement.executeUpdate(deleteSQL);
            System.out.println(rowsAffected + " row(s) deleted from 'employees' table.");
        }
    }
}

