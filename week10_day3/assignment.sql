-- Task 1: Retrieve FirstName and LastName using FULL JOIN with Enrollment
SELECT
    s.FirstName,
    s.LastName
FROM
    Student s
FULL JOIN
    Enrollment e ON s.StudentID = e.StudentID;

-- Task 2: Retrieve all columns from Student and Enrollment using NATURAL JOIN
SELECT
    *
FROM
    Student
NATURAL JOIN
    Enrollment;
