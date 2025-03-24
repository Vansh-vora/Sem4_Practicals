--Create a function to find minimum salary of an employee.

--We will use the table which is made in ass4_1_3.sql

create or replace function min1
return number
is
c1 number;
BEGIN
--USE MIN KEYWORD
  select MIN(salary)into c1 from sal;
  return c1;
END;
/

DECLARE
m number;
BEGIN
m:=min1;
DBMS_OUTPUT.PUT_LINE('Minimum Salary: '||m);
END;
/