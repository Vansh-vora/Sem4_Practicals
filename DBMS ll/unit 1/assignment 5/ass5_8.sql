--Create a cursor on employee table using %rowcount.

DECLARE
  v_count number;

Begin
  select COUNT(*) into v_count from EMPLOYEES;
  DBMS_OUTPUT.PUT_LINE('Total rows: '||v_count);
End;
/