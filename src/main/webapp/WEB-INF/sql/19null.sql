-- NULL : 필드(컬럼)에 값 자체가 없음
SELECT * FROM Employees;

-- NULL인 필드가 있는 레코드 조회
SELECT * FROM Employees WHERE Notes = NULL; -- (X)

SELECT * FROM Employees WHERE Notes IS NULL; -- IS NULL


-- NULL 이 아닌 필드가 있는 레코드 조회
SELECT * FROM Employees WHERE NOTES IS NOT NULL; -- IS NOT NULL

SELECT * FROM Employees WHERE NOT Notes IS NULL;












