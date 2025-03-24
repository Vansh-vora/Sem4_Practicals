--Create a procedure to insert a new row in Customer table.

-- create a table 
create table customer (id NUMBER,name VARCHAR2(50));

BEGIN
  insert into customer(id,name)values(1,'Vansh');
  insert into customer(id,name)values(2,'Sarthak');
END;
/

create or REPLACE procedure Addrow
AS
BEGIN
  insert into customer(id,name)values(3,'Aagam');
END;
/
BEGIN
  Addrow;
END;
/

--to check
select * from customer;