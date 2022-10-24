USE w3schools;

SELECT * FROM Employees ORDER BY EmployeeID DESC;
-- INSERT INTO : 테이블에 레코드 추가하는 명령문

INSERT INTO Employees (EmployeeID, LastName, FirstName, BirthDate, Photo, Notes)
                 VALUE(10, 'Son', 'HM', '1999-01-01', 'EmpID10.pic', 'soccer player');
                 
-- 11번째 직원 추가
INSERT INTO Employees (EmployeeID, LastName, FirstName, BirthDate, Photo, Notes)
                 VALUE(11, 'Yu', 'JS', '2022-10-13', 'EmpID11.pic', 'baseball player');

-- 12번째 직원 추가, notes 컬럼 빼고
INSERT INTO Employees (EmployeeID, LastName, FirstName, BirthDate, Photo)
                 VALUE(12, 'Parker', 'Piter', '1982-10-13', 'EmpID12.pic');

-- 13번째 직원 추가, birthDate notes 컬럼 빼고
INSERT INTO Employees (EmployeeID, LastName, FirstName, Photo)
                 VALUE(13, 'Logers', 'Captin', 'EmpID13.pic');

-- 새 직원 추가, EmployeeID 컬럼 빼고
INSERT INTO Employees(LastName, FirstName) VALUES('Romanoff', 'Natasha');

INSERT INTO Employees(LastName, FirstName, Notes) VALUES('Kim', 'kildong1', '');

INSERT INTO Employees(LastName, FirstName, Notes) VALUES('Kim', 'kildong2', '');

-- NULL은 값이 없음


-- Customers 테이블에 레코드 추가
SELECT * FROM Customers ORDER BY 1 DESC;

INSERT INTO Customers (CustomerID, CustomerName. ContactName, Address, City, PostalCode, Country)
               VALUES (100, 'Steve', 'Captain', 'brooklyn', 'NewYork', '33333', 'USA');
               
INSERT INTO Customers (CustomerName. ContactName, Address, City, PostalCode, Country)
               VALUES ('Stephan', 'Strange', 'brooklyn', 'NewYork', '33333', 'USA');    
               
-- DESCRIBE : 테이블 구조 조회, 제약사항(Constraints) 조회
DESC Customers;
















