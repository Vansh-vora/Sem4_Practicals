-- 16. Write a program to display the fibonacci series from 1 to 10
DECLARE
num1 NUMBER := 0;
num2 NUMBER := 1;
nextNum NUMBER;

BEGIN
for i in 0 .. 10 loop
DBMS_Output.Put_Line(num1);

nextNum := num1 + num2;
num1 := num2;
num2 := nextNum;
END loop;
END;
/