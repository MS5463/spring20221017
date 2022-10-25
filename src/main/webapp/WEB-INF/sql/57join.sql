CREATE DATABASE mydb6;
USE mydb6;

CREATE TABLE TableA (
	col1 INT
);

CREATE TABLE TableB (
	c1 INT
);

INSERT INTO TableA (col1)
VALUES (1), (2), (3), (4), (5); 
INSERT INTO TableB (c1)
VALUES (2), (4), (5), (7), (8); 

SELECT * FROM TableA;
SELECT * FROM TableB;

-- INNER JOIN : 두 컬럼에 값이 모두 있는 경우만(겹치는 컬럼만 표시)
 SELECT * FROM TableA A INNER JOIN TableB B ON A.col1 = B.c1;
-- INNER : INNER JOIN 중 INNER 부분은 생략 가능
SELECT * FROM TableA A JOIN TableB B ON A.col1 = B.c1;

-- LEFT OUTER JOIN : INNERJOIN 결과 + 원쪽 테이블의 레코드들(고유 컬럼)
SELECT * FROM TableA A LEFT OUTER JOIN TableB B ON A.col1 = B.c1;  
-- OUTER : OUTER LEFT JOIN 중 OUTER 부분은 생략 가능
SELECT * FROM TableA A LEFT JOIN TableB B ON A.col1 = B.c1; 

-- RIGHT OUTER JOIN : INNERJOIN 결과 + 오른쪽 테이블의 레코드들(고유 컬럼)
SELECT * FROM TableA A RIGHT OUTER JOIN TableB B ON A.col1 = B.c1; 
-- OUTER : OUTER RIGHT JOIN 중 OUTER 부분은 생략 가능
SELECT * FROM TableA A RIGHT JOIN TableB B ON A.col1 = B.c1; 
