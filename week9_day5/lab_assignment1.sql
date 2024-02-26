-- Task 1: Retrieve records from the Student table where student was born after 16th June 2009
SELECT *
FROM Student
WHERE DateOfBirth > '2009-06-16';

-- Task 2: Retrieve records from the Student table where FirstName starts with A or J
SELECT *
FROM Student
WHERE FirstName LIKE 'A%' OR FirstName LIKE 'J%';

-- Task 3: Retrieve records from the Student table where FirstName is NOT Alice and email ends with @example.com
SELECT *
FROM Student
WHERE FirstName <> 'Alice' AND Email LIKE '%@example.com';
