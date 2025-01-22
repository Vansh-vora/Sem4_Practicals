-- 21.Write a program to accept a number and print the multiplication tables upto soo (i think they meant num to num + 1)
DECLARE
num NUMBER := &num;
res NUMBER;
BEGIN
for i in num .. num + 5 loop
for j in 1 .. 10 loop
res := i * j;
DBMS_Output.Put_Line(i || ' * ' || j || ' = ' || res);
END loop;
DBMS_Output.Put_Line('---------------------');
END loop;
END;
/