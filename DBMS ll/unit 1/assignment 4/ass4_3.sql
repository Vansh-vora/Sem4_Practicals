--Create a procedure to Just print a message on prompt.
CREATE OR REPLACE procedure greetings
AS
BEGIN
  DBMS_OUTPUT.PUT_LINE('Hello World!');
  END;
  /
--To Execute it 
Exec greetings