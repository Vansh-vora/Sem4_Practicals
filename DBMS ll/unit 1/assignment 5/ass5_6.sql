--Create a cursor on employee table, if fetched rows are greater than 3, exit from the cursor

DECLARE 
  c_id EMPLOYEES.id%type;
  c_name EMPLOYEES.name%type;
  c_salary EMPLOYEES.salary%type;
  rows int:=0;
  Cursor c is select id,name,salary from EMPLOYEES;

Begin
  OPEN c;
  LOOP
    Fetch c into c_id,c_name,c_salary;
    exit when c%notfound OR rows>3;
    rows:=rows+1;
    DBMS_OUTPUT.PUT_LINE('ID: '||c_id||'Name: '||c_name||'Salary: '||c_salary);
  END LOOP;
  close c;
End;
/