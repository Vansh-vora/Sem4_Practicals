-- Create a procedure to find a employee whose id is 1.

--create a table
create table emp (id NUMBER,name VARCHAR2(50));

BEGIN
  insert into emp(id,name)values(1,'Vansh');
  insert into emp(id,name)values(2,'Aagam');
End;
/

create or REPLACE procedure sel
is
c_id emp.id%type;
c_name emp.name%type;

BEGIN
  select id,name into c_id,c_name from emp where id=1;
  DBMS_OUTPUT.PUT_LINE('ID: '||c_id||'Name: '||c_name);
End;
/

BEGIN
  sel;
END;
/