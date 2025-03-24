--Create a procedure to display the users record. 

--create a table and insert it values
Create table abcd(cid NUMBER,csal NUMBER);

BEGIN
  insert into abcd(cid,csal)values(1,35000);
  insert into abcd(cid,csal)values(2,45000);
END;
/

Create or REPLACE procedure dis
is
  v_cid abcd.cid%type;
  v_csal abcd.csal%type;

BEGIN
  select cid,csal into v_cid,v_csal from abcd where cid=1;
    DBMS_OUTPUT.PUT_LINE('ID:'||v_cid);
    DBMS_OUTPUT.PUT_LINE('Salary:'||v_csal);
END;
/

BEGIN 
  dis;
End;
/