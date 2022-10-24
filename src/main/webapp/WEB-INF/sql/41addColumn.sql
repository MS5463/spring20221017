-- alter table : 테이블 수정
-- add column : 컬럼 추가
CREATE TABLE MyTable17 (
	col1 INT,
    col2 INT
);

ALTER TABLE MyTable17
ADD COLUMN col3 INT;

ALTER TABLE MyTable17
ADD COLUMN col4 INT NOT NULL UNIQUE DEFAULT 0;

ALTER TABLE MyTable17
ADD COLUMN col5 INT FIRST;

ALTER TABLE MyTable17
ADD COLUMN col6 INT AFTER col2;

DESC MyTable17;

-- col7 컬럼 추가
-- type : VARCHAR(255)
-- constraints : NOT NULL, UNIQUE, DEFAULT 'empty'
ALTER TABLE MyTable17
ADD COLUMN col7 VARCHAR(255) NOT NULL UNIQUE DEFAULT 'empty';









