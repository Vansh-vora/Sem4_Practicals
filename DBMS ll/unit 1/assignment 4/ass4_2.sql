--Create a procedure to find the square and cube of a number. Only 1 input should be taken as IN and OUT.
CREATE OR REPLACE procedure square_cube (n IN OUT NUMBER)
AS
BEGIN
  DBMS_OUTPUT.PUT_LINE('Square:'|| n*n);
  DBMS_OUTPUT.PUT_LINE('Cube:'|| n*n*n);
END;
/

DECLARE
  num NUMBER:=4;
BEGIN
  square_cube(num);
  DBMS_OUTPUT.PUT_LINE('After procedure call,num is:'||num);
END;
/