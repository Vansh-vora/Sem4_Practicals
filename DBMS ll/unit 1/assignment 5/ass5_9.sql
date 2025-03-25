--Demonstrate %found and %rowcount implicit cursor on employee table.

DECLARE
  total_rows number(2);
Begin
  UPDATE EMPLOYEES set salary=salary+5000;
  if sql%notfound then
  DBMS_OUTPUT.PUT_LINE('NO Customer updated');
  elsif sql%found then
  total_rows:=sql%rowcount;
  DBMS_OUTPUT.PUT_LINE(total_rows ||'customer updated');
  End if;
END;
/