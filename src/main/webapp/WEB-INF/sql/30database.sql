-- DATABASE (SCHEMA) 스키마 만들기
CREATE DATABASE mydb1;

-- 데이터베이스 사용하기
USE mydb1;
USE w3schools; -- USE : 사용 데이터베이스 변경

SELECT * FROM Customers;
INSERT INTO;
DELETE;
UPDATE;

-- 다른 스키마(데이터베이스)에 있는 테이블 사용하기
USE mydb1;

-- 앞에 스키마 이름을 붙여서 사용 가능
SELECT * FROM w3schools.Customers;

-- 데이터베이스 삭제
DROP DATABASE w3schools;







