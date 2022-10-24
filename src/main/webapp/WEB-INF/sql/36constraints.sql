-- NOT NULL : NULL이면 안 됨
CREATE TABLE MyTable10(
	col1 VARCHAR(255),
	col2 VARCHAR(255) NOT NULL
);

DESC MyTable10;
INSERT INTO MyTable10 (col1, col2) VALUES ('a', 'b'); -- OK
INSERT INTO MyTable10 (col2) VALUES ('c'); -- OK
INSERT INTO MyTable10 (col1) VALUES ('d'); -- Error Code 1364

SELECT * FROM MyTable10;

Create TABLE MyTable11 (
	col1 INT,
    col2 INT NOT NULL -- NULL 인체로 남아있지 않는다.
);

INSERT INTO MyTable11 (col1, col2) VALUES (3, 4); 
INSERT INTO MyTable11 (col2) VALUES (4); -- NULL, 4 
INSERT INTO MyTable11 (col2) VALUES (3); -- 3, 0 
SELECT * FROM MyTable11;







