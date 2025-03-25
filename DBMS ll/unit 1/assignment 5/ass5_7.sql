--Create a cursor and found curos is OPEN or NOT.

-- create table
create table product3(id number);

Begin
  insert into product3(id)values(1);
  insert into product3(id)values(2);
END;
/

DECLARE
  cursor c_cursor is select id from product3;
Begin
  open c_cursor;
  
  if c_cursor%isopen then
    DBMS_OUTPUT.PUT_LINE('Cursor is Open');
  Else
    DBMS_OUTPUT.PUT_LINE('Curson is closed');
  End if;
  close c_cursor;
End;
 --for closed 
DECLARE
  cursor c_cursor is select id from product3;
Begin
  open c_cursor;
  close c_cursor;
  if c_cursor%isopen then
    DBMS_OUTPUT.PUT_LINE('Cursor is Open');
  Else
    DBMS_OUTPUT.PUT_LINE('Curson is closed');
  End if;
  
END;
/