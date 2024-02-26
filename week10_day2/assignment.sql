-- Task 1: Select FirstName, Email, and EnrollmentID using an inner join between Student and Enrollment tables
SELECT
    s.FirstName,
    s.Email,
    e.EnrollmentID
FROM
    Student s
INNER JOIN
    Enrollment e ON s.StudentID = e.StudentID;

-- Task 2: Retrieve FirstName, Email, and EnrollmentID using RIGHT JOIN
SELECT
    s.FirstName,
    s.Email,
    e.EnrollmentID
FROM
    Student s
RIGHT JOIN
    Enrollment e ON s.StudentID = e.StudentID;

-- Task 3: Retrieve EnrollmentID, FirstName, and Email using RIGHT JOIN
SELECT
    e.EnrollmentID,
    s.FirstName,
    s.Email
FROM
    Enrollment e
RIGHT JOIN
    Student s ON e.StudentID = s.StudentID;
