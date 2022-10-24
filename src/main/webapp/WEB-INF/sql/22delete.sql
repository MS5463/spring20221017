-- DELETE : 테이블의 레코드 삭제	

DELETE FROM Customers WHERE CustomerID = 1;	
SELECT * FROM Customers WHERE CustomerID = 1;

-- 고객 테이블에서 90번 고객 삭제
DELETE FROM Customers WHERE CustomerID = 90; -- 삭제 
SELECT * FROM Customers WHERE CustomerID = 90; -- 확인

-- 고객 테이블에서 91번 고객 삭제
DELETE FROM Customers WHERE CustomerID = 91; -- 삭제
SELECT * FROM Customers WHERE CustomerID = 91; -- 확인

-- USA 고객들 지우기
DELETE FROM Customers WHERE Country = 'USA'; -- 삭제
SELECT * FROM Customers WHERE Country = 'USA'; -- 확인

-- UK 고객들 지우기 
DELETE FROM Customers WHERE Country = 'UK'; -- 삭제
SELECT * FROM Customers WHERE Country = 'UK'; -- 확인

-- Maxico 고객들 지우기
DELETE FROM Customers WHERE Country = 'Maxico'; -- 삭제
SELECT * FROM Customers WHERE Country = 'Maxico'; -- 확인












