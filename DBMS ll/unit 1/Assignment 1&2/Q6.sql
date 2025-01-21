-- 6.write a program to find the sum of numbers from 1 to 100
DECLARE
i NUMBER := 1;
res NUMBER := 0;

BEGIN
While i <=100 loop
res := res + i;
i := i + 1;
END loop;

DBMS_Output.Put_Line('The Sum of 1 to 100 is:'|| res);
END;
/