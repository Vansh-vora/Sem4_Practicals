-- 11. Write a program to accept a number and print it in reverse order
DECLARE
i NUMBER :=&i;
reminder NUMBER := 0;
rev NUMBER := 0;
temp NUMBER := i;

BEGIN
While temp !=0 loop
reminder := MOD(temp,10);
rev := (rev * 10) + reminder;

temp := TRUNC(temp / 10);
END loop;

DBMS_Output.Put_Line('Reverse of num '|| i || ' is ' || rev);
END;
/