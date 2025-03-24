-- Create a function to find total salary of all employee.

--we will use the table made in ass4_1_3.sql

create or replace function total1
return number
is 
c1 number;
BEGIN
  --USE SUM KEYWORD
  select SUM(salary) into c1 from sal;
  return c1;
END;
/

DECLARE
t Number;
BEGIN
t:=total1;
DBMS_OUTPUT.PUT_LINE('Total Salary: '||t);
END;
/