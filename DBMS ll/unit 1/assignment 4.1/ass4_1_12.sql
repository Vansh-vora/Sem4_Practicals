--Create user defined an Exception and raise it: Calculate 5% increment in salary of an employee, if salary is greater than 25000, raise an exception “Salary is Out of the Limit”.

--create a table
create table s(id number,salary number);

BEGIN
  insert into s(id,salary)values(1,20000);
  insert into s(id,salary)values(2,25000);
END;
/

DECLARE
c_sal int;
num Exception;

BEGIN
  update s set salary=salary+(salary*0.5)where id=2;
  select salary into c_sal from s where id=2;
if(c_sal>25000) then
  raise num;
else
  DBMS_OUTPUT.PUT_LINE('Salary: '||c_sal);
end if;

exception
  when num then
    DBMS_OUTPUT.PUT_LINE('Salary is Out of the Limit');
END;
/
