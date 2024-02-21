-- Insert records into the Student table
INSERT INTO Student (StudentID, FirstName, LastName, DateOfBirth, Gender, Email, Phone) VALUES
('S101', 'John', 'Doe', '2000-10-10', 'M', 'john@example.com', '9878457945'),
('S102', 'Jane', 'Smith', '2013-08-08', 'M', 'jane@example.com', '9977457745'),
('S103', 'Alice', 'Johnson', '2011-09-08', 'F', 'alice@example.com', '9876457845'),
('S104', 'Anna', 'Doe', '2011-07-08', 'F', 'Anna.doe@india.com', '9876457842'),
('S105', 'Peter', 'Parker', '2011-06-05', 'M', 'p_parker@example.com', '9276457843');

-- Retrieve all data from the Student table
SELECT * FROM Student;

-- Retrieve only the FirstName from the Student table
SELECT FirstName FROM Student;

-- Insert records into the Course table
INSERT INTO Course (CourseID, CourseTitle, Credits) VALUES
('C101', 'Math101', 12),
('C102', 'History101', 13),
('C103', 'Computer Science101', 11);

-- Retrieve all data from the Course table
SELECT * FROM Course;

-- Insert records into the Instructor table
INSERT INTO Instructor (InstructorID, Email, FirstName, LastName) VALUES
('I101', 'sunil@example.com', 'Sunil', 'Rawat'),
('I102', 'nida@example.com', 'Nida', 'Fatima'),
('I103', 'shiv@example.com', 'Shiv', 'Kumar');

-- Retrieve all data from the Instructor table
SELECT * FROM Instructor;

-- Enroll students in courses in the Enrollment table
INSERT INTO Enrollment (EnrollmentID, StudentID, CourseID, InstructorID) VALUES
('E1001', 'S101', 'C101', 'I101'),
('E1002', 'S102', 'C101', 'I101'),
('E1003', 'S103', 'C102', 'I102');

-- Retrieve all data from the Enrollment table
SELECT * FROM Enrollment;

-- Insert scores into the Score table
INSERT INTO Score (ScoreID, StudentID, CourseID, CreditObtained, DateOfExam) VALUES
('SC101', 'S101', 'C101', '12', '2022-10-10'),
('SC102', 'S102', 'C101', '10', '2022-10-10');

-- Retrieve all data from the Score table
SELECT * FROM Score;

-- Insert feedback into the Feedback table (with an auto-increment primary key)
INSERT INTO Feedback (StudentID, InstructorName, Feedback) VALUES
('S101', 'I101', 'Session was good'),
('S102', 'I101', 'Topic was well explained'),
('S103', 'I102', 'Session was excellent');

-- Retrieve all data from the Feedback table
SELECT * FROM Feedback;
