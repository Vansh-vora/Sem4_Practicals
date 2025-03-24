--Create a procedure to update the salary of an employee whose name is ‘Dinesh’. 

-- create a table 
create table employee(name VARCHAR2(50),salary NUMBER);

BEGIN
  insert into employee(name,salary)values('Dinesh',40000);
  insert into employee(name,salary)values('Ramesh',30000);
END;
/

create or REPLACE procedure up
is
BEGIN
  update employee set salary=salary+1000 where name='Dinesh';
END;
/

BEGIN
  up;
End;
/

--to check 
select * from employee;