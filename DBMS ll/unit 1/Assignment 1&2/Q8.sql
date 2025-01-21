-- 8.Write a program to find the sum of all even numbers from 1 to 100
DECLARE
i NUMBER := 2;
res NUMBER := 0;

BEGIN
While i <= 100 loop
res := res + i;
i := i + 2;
END loop;
DBMS_Output.Put_Line('The sum of all even numbers from 1 to 100 is:'|| res);
END;
/