-- 12.Write a program to accept a no and check whether it is Armstrong number or not
DECLARE
i NUMBER :=&i;
reminder NUMBER := 0;
res NUMBER := 0;
temp NUMBER := i;

BEGIN
While temp !=0 loop
reminder := MOD(TEMP,10);
res := res + (reminder * reminder * reminder);
temp := TRUNC(temp / 10);
END loop;

IF i = res THEN
DBMS_Output.Put_Line('The Number is Armstrong');
ELSE
DBMS_Output.Put_Line('The Number is Not a Armstrong');
END IF;
END;
/