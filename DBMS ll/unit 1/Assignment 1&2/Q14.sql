-- 14. Write a program to generate all prime numbers between 1 to 100
DECLARE
num NUMBER := 2;

isPrime boolean;

BEGIN
While num <=100 loop
isPrime := TRUE;
for temp in 2 .. TRUNC(num / 2) loop
isPrime := TRUE;
if (MOD(num, temp) = 0) THEN
isPrime := False;
EXIT;
END if;
END loop;
if (isPrime = TRUE) THEN
DBMS_Output.Put_Line(num);
END if;

num := num + 1;
END loop;
END;
/
