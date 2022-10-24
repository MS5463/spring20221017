-- NOT : False → True, True → False

SELECT * FROM Customers;
SELECT * FROM Customers WHERE Country = 'Germany';
-- 6, 7, 8 모두 결과가 같음
SELECT * FROM Customers WHERE Country <> 'Germany'; 
SELECT * FROM Customers WHERE Country != 'Germany';
SELECT * FROM Customers WHERE NOT Country = 'Germany';

-- 미국(USA)에 살지 않는 고객들
SELECT * FROM Customers WHERE NOT Country = 'USA';

-- USA 있지 않는 공급자들 (Suppliers)
SELECT * FROM Suppliers WHERE NOT Country = 'USA';

-- 주문일자(OrderDate)가 97년도가 아닌 주문 번호들(Orders)
SELECT * FROM Orders WHERE NOT OrderDate >= '1997-01-01'
					    OR NOT OrderDate < '1998-01-01';
                        
SELECT * FROM Orders WHERE NOT OrderDate >= '1997-01-01'
					       AND OrderDate < '1998-01-01';                        
					
						  







