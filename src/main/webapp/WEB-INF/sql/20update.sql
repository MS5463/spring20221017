-- UPDATE 레코드(row)의 필드(column)들을 수정
UPDATE Customers SET ContactName = 'Alfred Schmit' WHERE CustomerID = 1;

SELECT * FROM Customers WHERE CustomerID = 1;

SELECT * FROM Customers ORDER BY 1 DESC;

UPDATE Cutomers SET ContactName = 'Maria Schmit',
						   City = 'Frankfurt'
 WHERE CustomerID = 1;

-- 데이터를 수정하면 수정하기 전으로 고치기 힘들기 때문에 수정하기 전 제대로 확인할 것

-- 92번 고객의 고객명, 계약자명, 주소, 도시, 우편번호, 국가를 수정하는 쿼리 작성 / 실행
UPDATE Customers SET CustomerName = 'Park' ,
					  ContactName = 'JI SUNG',
                          Address = 'NY',
							 City = 'Seoul',
					   PostalCode = '3333',
						  Country = 'USA'
WHERE CustomerID = 92;

SELECT * FROM Customers WHERE CustomerID = 92;

-- 93번 고객의 고객명, 계약자명, 주소, 도시, 우편번호, 국가를 수정하는 쿼리 작성 / 실행
UPDATE Customers SET CustomerName = 'Son' ,
					  ContactName = 'HM',
                          Address = 'london',
							 City = 'London',
					   PostalCode = '22222',
						  Country = 'UK'
WHERE CustomerID = 93;

SELECT * FROM Customers WHERE CustomerID = 93;



