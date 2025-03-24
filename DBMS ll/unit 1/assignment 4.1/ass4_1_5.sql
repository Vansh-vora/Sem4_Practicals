--Create a function to find average salary of an employee.

--We will use the table use in ass4_1_3.sql

create or replace function avg1
return number
is 
c1 number;
BEGIN
  --USE AVG KEYWORD
  select AVG(salary) into c1 from sal;
  return c1;
END;
/

DECLARE
a Number;
BEGIN
a:=avg1;
DBMS_OUTPUT.PUT_LINE('Average Salary: '||a);
END;
/