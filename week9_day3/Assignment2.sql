CREATE DATABASE Anudip_Employee ;

USE Anudip_Employee ;

-- Task 0: Create Employee Table
CREATE TABLE Employee (
    emp_id INT PRIMARY KEY,
    first_name VARCHAR(50),
    last_name VARCHAR(50),
    age INT,
    email VARCHAR(100)
);

-- Task 1: Insert Data
INSERT INTO Employee (emp_id, first_name, last_name, age, email)
VALUES
    (1, 'John', 'Doe', 28, 'john.doe@example.com'),
    (2, 'Jane', 'Smith', 35, 'jane.smith@example.com'),
    (3, 'Michael', 'Johnson', 40, 'michael.johnson@example.com'),
    (4, 'Emily', 'Brown', 24, 'emily.brown@example.com'),
    (5, 'William', 'Taylor', 32, 'william.taylor@example.com');

-- Task 2: Retrieving Data
SELECT first_name, last_name
FROM Employee;

-- Task 3: Filtering Data
SELECT first_name, last_name, age
FROM Employee
WHERE age > 30;

-- Task 4: Updating Data
UPDATE Employee
SET age = age + 1
WHERE age > 25;
