--Fetch and display all employee names and salaries using an explicit cursor.

DECLARE
  c_name EMPLOYEES.name%type;
  c_salary EMPLOYEES.salary%type;

  Cursor c is select name,salary from EMPLOYEES;
Begin
  OPEN c;
  LOOP
    fetch c into c_name,c_salary;
    exit when c%notfound;
    DBMS_OUTPUT.PUT_LINE('Name: '||c_name||'Salary: '||c_salary);
  END LOOP;
  close c;
END;
/