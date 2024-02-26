-- Add new columns Age (INT) and Address (VARCHAR(100)) to the Student table
ALTER TABLE Student
ADD COLUMN Age INT NOT NULL,
ADD COLUMN Address VARCHAR(100) NOT NULL;
