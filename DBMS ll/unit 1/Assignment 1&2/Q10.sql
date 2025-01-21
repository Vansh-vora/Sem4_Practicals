-- 10. Write a program to accept a number and find the sum of the digits
DECLARE
a NUMBER := &a;
b NUMBER := &b;
res NUMBER;
BEGIN
res := a + b;
DBMS_Output.Put_Line(a || ' + ' || b || ' = ' || res);
END;
/