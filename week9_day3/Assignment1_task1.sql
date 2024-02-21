-- Update the Student table
UPDATE Student
SET Email = 'jane_Smith@example.com'
WHERE FirstName = 'Jane'
AND LastName = 'Smith';

-- Update the Instructor table
UPDATE Instructor
SET Email = 'sunilrawat@example.com'
WHERE FirstName = 'Sunil'
AND LastName = 'Rawat';
