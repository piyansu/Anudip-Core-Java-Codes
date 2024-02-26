-- Task 1: Create a table Person with PersonID int, FirstName varchar(255), LastName varchar(255), and age int
CREATE TABLE Person (
    PersonID INT PRIMARY KEY,
    FirstName VARCHAR(255),
    LastName VARCHAR(255),
    Age INT
);

-- Task 2: Create a table Employee with emp_id int, first_name varchar(255), last_name varchar(255), and age int
CREATE TABLE Employee (
    emp_id INT PRIMARY KEY,
    first_name VARCHAR(255),
    last_name VARCHAR(255),
    age INT
);

-- Task 3: Insert data into the Person table
INSERT INTO Person (PersonID, FirstName, LastName, Age)
VALUES
    (1, 'John', 'Doe', 25),
    (2, 'Jane', 'Smith', 30),
    (3, 'Alice', 'Johnson', 28),
    (4, 'Bob', 'Jones', 35),
    (5, 'Mary', 'Brown', 22);

-- Task 4: Insert data into the Employee table
INSERT INTO Employee (emp_id, first_name, last_name, age)
VALUES
    (101, 'Michael', 'Scott', 40),
    (102, 'Pam', 'Beesly', 35),
    (103, 'Jim', 'Halpert', 33),
    (104, 'Dwight', 'Schrute', 37),
    (105, 'Angela', 'Martin', 39);

-- Task 5: Create Union of two tables
SELECT 'Person' AS TableType, PersonID, FirstName, LastName, Age
FROM Person
UNION ALL
SELECT 'Employee' AS TableType, emp_id AS PersonID, first_name AS FirstName, last_name AS LastName, age AS Age
FROM Employee;
