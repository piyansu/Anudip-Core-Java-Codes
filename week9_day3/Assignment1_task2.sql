-- Delete records from the Score table for students with last name 'Smith'
DELETE FROM Score
WHERE StudentID IN (
    SELECT StudentID
    FROM Student
    WHERE LastName = 'Smith'
);

-- Next, delete records from the Enrollment table for students with last name 'Smith'
DELETE FROM Enrollment
WHERE StudentID IN (
    SELECT StudentID
    FROM Student
    WHERE LastName = 'Smith'
);

-- Finally, delete students with last name 'Smith' from the Student table
DELETE FROM Student
WHERE LastName = 'Smith';
