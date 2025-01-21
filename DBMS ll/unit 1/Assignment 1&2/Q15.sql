-- 15. Write a program to aceept a number and check whether it is prime number or not

DECLARE
num NUMBER := &num;
isPrime boolean :=TRUE;

BEGIN
for i in 2 .. TRUNC(num / 2) loop
if(MOD(num, i) = 0) THEN
isPrime := False;
EXIT;
END if;
END loop;

If(isPrime) THEN
DBMS_Output.Put_Line('The Number is Prime Number');
ELSE
DBMS_Output.Put_Line('The Number is not a Prime Number');
END if;
END;
/