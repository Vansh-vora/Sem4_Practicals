-- 19.Find the factorials of numbers from 1 to 10
DECLARE
fact NUMBER := 1;

BEGIN
for i in 1 .. 10 loop

for j in 1 .. i loop
fact := fact * j;
END loop;
DBMS_Output.Put_Line('The factorial of' || i || 'is :' || fact);
END loop;
END;
/
