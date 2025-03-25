--Fetch and process employees while checking cursor attributes like %ROWCOUNT and %FOUND.

DECLARE
  rows number;
Begin
  UPDATE EMPLOYEES set id=id+1;
  if sql%notfound then
  DBMS_OUTPUT.PUT_LINE('No record');
  elsif sql%found then
  rows:=sql%ROWCOUNT;
  DBMS_OUTPUT.PUT_LINE('Row Count: '||rows);
  END if;
END;
/
