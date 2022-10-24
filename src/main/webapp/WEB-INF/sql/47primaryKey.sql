USE mydb2;
-- 학생 TABLE	
-- ID, 이름, 나이, 성별
CREATE TABLE Student (
	id INT PRIMARY KEY AUTO_INCREMENT, -- primary key(UNIQUE NOT NULL 동시 포함)
    name VARCHAR(255),				   -- AUTO_INCREMENT(id를 순서에 맞게 배정함)
    age INT,
    gender VARCHAR(1)
);

INSERT INTO Student (id, name, age, gender)
VALUES (1, 'kim', 30, 'F');

INSERT INTO Student (id, name, age, gender)
VALUES (2, 'lee', 40, 'M');

INSERT INTO Student (name, age, gender)
VALUES ('choi', 50, 'F');

SELECT * FROM Student;

DELETE FROM Student WHERE id = 2;
DELETE FROM Student WHERE id = 3;

INSERT INTO Student (name, age, gender)
VALUES ('park', 60, 'M'); 
-- 자동으로 id 순서에 맞게 추가됨(id 2와 id 3을 지워도 id 4번으로 배정)













