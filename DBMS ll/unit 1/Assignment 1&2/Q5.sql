-- 5. Write a program for multiplication table
DECLARE
num NUMBER :=5;
i NUMBER :=1;
res NUMBER;

BEGIN
DBMS_Output.Put_Line('The table of 5 is :');
While i <= 10 loop
res := num * i;
DBMS_Output.Put_Line(num || ' * ' || i || ' = ' || res);
i := i + 1;
END loop;
END;
/