-- Retrieve StudentID, FirstName, DateOfBirth, Email, and CourseID from CoursesEnrolled by a student with StudentID 'S102'
SELECT
    -- Subquery to get the StudentID for the specified student
    (SELECT StudentID FROM Student WHERE StudentID = 'S102') AS StudentID,
    
    -- Subquery to get the FirstName for the specified student
    (SELECT FirstName FROM Student WHERE StudentID = 'S102') AS FirstName,
    
    -- Subquery to get the DateOfBirth for the specified student
    (SELECT DateOfBirth FROM Student WHERE StudentID = 'S102') AS DateOfBirth,
    
    -- Subquery to get the Email for the specified student
    (SELECT Email FROM Student WHERE StudentID = 'S102') AS Email,
    
    -- Get the CourseID from the Enrollment table for the specified student
    CourseID
FROM Enrollment
WHERE StudentID = 'S102'
LIMIT 1;
