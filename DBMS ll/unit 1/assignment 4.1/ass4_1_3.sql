--Create a function to find maximum salary of an employee.

--create a table 
create table sal(id Number,salary Number);

BEGIN
  insert into sal(id,salary)values(1,40000);
  insert into sal(id,salary)values(2,50000);
  insert into sal(id,salary)values(3,30000);
END;
/


create or replace function max1
return number
is 
c1 number;
BEGIN
--USE MAX KEYWORD
select MAX(salary) into c1 from sal;
return c1;
END;
/

DECLARE
  m number;
BEGIN
  m:=max1;
  DBMS_OUTPUT.PUT_LINE('Maximum Salary: '||m);
END;
/