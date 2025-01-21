-- 4. Write a program to print the odd numbers from 1 to 100
DECLARE
i NUMBER :=1;

BEGIN
While i <=100 loop
DBMS_Output.Put_Line(i);
i := i + 2;
END loop;
END;
/