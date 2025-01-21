-- 7.Write a program to find the sum of all odd numbers from 1 to 100
DECLARE
i NUMBER := 1;
res NUMBER := 0;

BEGIN
While i <= 100 loop
res := res + i;
i := i + 2;
END loop;
DBMS_Output.Put_Line('The sum of all odd digits from 1-100 is:'|| res);
END;
/
