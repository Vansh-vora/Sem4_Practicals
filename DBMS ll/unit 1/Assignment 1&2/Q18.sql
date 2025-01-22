-- 18. Write a program to accept a number and find the factorial of the number
DECLARE
num NUMBER := &num;
fact NUMBER := 1;

BEGIN
for i in 1 .. num loop
fact := fact * i;
END loop;
DBMS_Output.Put_Line('The factorial of' || num || ' is ' || fact);
END;
/