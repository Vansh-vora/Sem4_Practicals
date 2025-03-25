--Demonstrate %notfound and % ISOPEN implicit cursor on employee table.

DECLARE
  v_id EMPLOYEES.id%type;
  v_name EMPLOYEES.name%type;
Begin
  select id,name into v_id,v_name from EMPLOYEES where id=1;
  DBMS_OUTPUT.PUT_LINE('ID: '||v_id||'Name: '||v_name);

  if sql%notfound then
  DBMS_OUTPUT.PUT_LINE('NO rows found using %notfound');
  Else
  DBMS_OUTPUT.PUT_LINE('Row found using %notfound');
  End if;

  if sql%isopen then
    DBMS_OUTPUT.PUT_LINE('Implicit Cursor is Open');
  Else
    DBMS_OUTPUT.PUT_LINE('Implicit Cursor is Closed');
  END if;
End;
/