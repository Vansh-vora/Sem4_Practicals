-- Create an Exception, if no record found for customer name=”Rakesh”.

--create a table 

create table cus(id number,name Varchar2(50));

BEGIN
insert into cus(id,name)values(1,'Vansh');
insert into cus(id,name)values(2,'Aagam');
END;
/

DECLARE
  c_id cus.id%type;
BEGIN
  select id into c_id from cus where name='Rakesh';
  DBMS_OUTPUT.PUT_LINE('ID: '||c_id);
Exception
when no_data_found then
  DBMS_OUTPUT.PUT_LINE('No Such row');
when others then
  DBMS_OUTPUT.PUT_LINE('Error');
end;
/