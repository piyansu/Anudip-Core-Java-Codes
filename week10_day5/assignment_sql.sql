create database anudip ;
drop database anudip ;

CREATE TABLE student (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50),
    age INT
);
INSERT INTO student (name, age) VALUES
    ('Piyansu', 25),
    ('Sipra', 30),
    ('Joy', 22),
    ('Ahana', 28),
    ('Rupam', 35);

TRUNCATE TABLE student ;
SELECT * FROM student ;