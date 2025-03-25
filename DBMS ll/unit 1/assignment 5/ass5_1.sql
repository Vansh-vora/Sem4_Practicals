--Create a Cursor and fetch employee details from an EMPLOYEES table and give a 10% raise to employees.

--create a table
create table EMPLOYEES(id number,name varchar2(50),salary number);

Begin
  insert into EMPLOYEES(id,name,salary)values(1,'Vansh',50000);
  insert into EMPLOYEES(id,name,salary)values(2,'aagam',40000);
  insert into EMPLOYEES(id,name,salary)values(3,'Sarthak',60000);
END;
/

DECLARE
  c_id EMPLOYEES.id%type;
  c_name EMPLOYEES.name%type;
  c_salary EMPLOYEES.salary%type;

  Cursor c is select id,name,salary from EMPLOYEES;
Begin
  OPEN c;
  LOOP
    FETCH c into c_id,c_name,c_salary;
  EXIT When c%notfound;
    UPDATE EMPLOYEES set salary=salary+(salary*0.5)where id=c_id;
      DBMS_OUTPUT.PUT_LINE('ID: '||c_id||'Name: '||c_name||'Salary: '||c_salary);
    END LOOP;
  close c;
END;
/