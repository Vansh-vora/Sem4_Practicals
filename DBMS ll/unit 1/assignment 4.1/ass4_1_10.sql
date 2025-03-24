--Create an Exception, if Value not found in employee table.

DECLARE
  c_id cus.id%type;
BEGIN
  select id into c_id from cus where name='xyz';
  DBMS_OUTPUT.PUT_LINE('Id: '||c_id);
Exception
  when no_data_found then
    DBMS_OUTPUT.PUT_LINE('No such value found');
end;
/