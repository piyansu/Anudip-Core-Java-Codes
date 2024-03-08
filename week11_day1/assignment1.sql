DELIMITER //
CREATE PROCEDURE GetInstructorFeedback(IN instructorName VARCHAR(255))
BEGIN
    SELECT feedback
    FROM instructor_feedback
    WHERE instructor = instructorName;
END //
DELIMITER ;
