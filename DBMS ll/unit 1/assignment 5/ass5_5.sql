--Use a cursor to count the number of employees in each department and display results.

DECLARE
  rows number;
Begin
  UPDATE EMPLOYEES2 set DEPT_ID=DEPT_ID+1;

  if sql%notfound then
    DBMS_OUTPUT.PUT_LINE('NO record');
  elsif sql%found then
    rows:=sql%rowcount;
    DBMS_OUTPUT.PUT_LINE('Rows Count: '||rows);
  End if;
END;
/