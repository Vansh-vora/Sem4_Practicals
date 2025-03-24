--Create a procedure to find maximum no from 3 no’s. Numbers should be entered by the user at run time.
CREATE OR REPLACE procedure findmax (a IN NUMBER,b IN NUMBER,c IN NUMBER)
AS
  max_number NUMBER;
BEGIN
IF (a >=b) and (a >=c) THEN
  max_number:=a;
ELSIF (b >=a) and (b >=c) THEN
  max_number:=b;
ELSE
  max_number:=c;
END IF;

  DBMS_OUTPUT.PUT_LINE('The Maximum number is: '||max_number);
END findmax;
/
--after running the program
Exec findmax(2,3,4);