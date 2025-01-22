-- 20. Write a program to aceept a number and display it in the Octal forma
DECLARE
num NUMBER := &num;
reminder NUMBER := 0;
octalnum VARCHAR(100) := '';

BEGIN
While num > 0 loop
reminder := MOD(num,0);
octalnum := reminder || octalnum;
num := TRUNC(num / 8);
END loop;
DBMS_Output.Put_Line('The number' || num || ' in octal is: ' || octalnum);
END;
/