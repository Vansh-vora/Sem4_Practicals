--Create an Exception, if many rows are fetching from the table.

--we will use table from ass4_1_7.sql

DECLARE
  c_id cus.id%type;
BEGIN
  select id into c_id from cus where name='Vansh';
  DBMS_OUTPUT.PUT_LINE('ID: '||c_id);
Exception
  when too_many_rows then 
    DBMS_OUTPUT.PUT_LINE('Too many rows');
  when others then
    DBMS_OUTPUT.PUT_LINE('Error');
END;
/