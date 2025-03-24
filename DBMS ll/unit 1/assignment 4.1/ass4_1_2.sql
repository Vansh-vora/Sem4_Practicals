--Create a function to find total no of employee available in records.

--create a table 
create table ex(id Number,name Varchar2(50));

BEGIN
  insert into ex(id,name)values(1,'Vansh');
  insert into ex(id,name)values(2,'Sarthak');
  insert into ex(id,name)values(3,'Aagam');
END;
/

create or replace function count1
return number
is
c1 number;
BEGIN
--USE COUNT KEYWORD
  select COUNT(id)into c1 from ex;
  return c1;
END;
/

DECLARE
rows number;
BEGIN
rows:=count1;
DBMS_OUTPUT.PUT_LINE('Rows: '||rows);
END;
/