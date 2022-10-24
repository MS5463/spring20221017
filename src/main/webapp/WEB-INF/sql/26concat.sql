-- CONCAT : 스트링을 연결한 결과 리턴
SELECT CONCAT('ab', 'de');
SELECT CONCAT('def', ' ', 'xyz', 'captain');

SELECT CustomerID,
	   CustomerName,
	   CONCAT(Address, ' ', City) address
 FROM Customers;
 
 -- 직원 테이블에서 FirstName, LastName
 -- 스페이스 구분해서 연결한 FullName 조회
 
 SELECT EmployeeID,
	    CONCAT(FirstName, ' ', LastName) FullName, 
	    BirthDate, 
	    Photo,
	    Notes
 FROM Employees;
 
 
 
 