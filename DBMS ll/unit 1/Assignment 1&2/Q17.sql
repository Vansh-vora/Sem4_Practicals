-- 17. Write a program to aceept a number and print it in binary format
DECLARE
num NUMBER := &num;
reminder NUMBER := 0;
binaryNum VARCHAR(100) := '';

BEGIN
While num > 0 loop
reminder := MOD(num,2);
binaryNum := reminder || binaryNum;
num := TRUNC(num / 2);
END loop;
DBMS_Output.Put_Line('The Number' || num || 'in binary isL: '|| binaryNum);
END;
/