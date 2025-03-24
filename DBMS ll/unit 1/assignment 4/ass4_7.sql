--Create a procedure to perform all the arithmatic operation on 2 or 3 numbers.

Create or REPLACE procedure arithmatic(n1 IN NUMBER,n2 IN NUMBER)
AS
BEGIN
  DBMS_OUTPUT.PUT_LINE('Addition = '||(n1+n2));
  DBMS_OUTPUT.PUT_LINE('Subtraction= '||(n1-n2));
  DBMS_OUTPUT.PUT_LINE('Multiplication= '||(n1*n2));
End;
/

--to take value from user 
exec arithmatic(4,2);