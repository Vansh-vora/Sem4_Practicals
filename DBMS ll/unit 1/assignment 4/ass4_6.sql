--Create a procedure to delete a record of a product where product price is 200.

--create a table
create table product(id NUMBER,price NUMBER);

BEGIN
  insert into product (id,price) values (1,300);
  insert into product (id,price) values (2,200);
END;
/

create or REPLACE procedure del
AS
BEGIN

  delete from product where price=200;
  DBMS_OUTPUT.PUT_LINE('Product with price 200 is deleted successfully');
End;
/

BEGIN
del;
END;
/

--to check the table
select * from product;