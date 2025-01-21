-- 13. Write a porgram to generate all the Armstrong numbers from 1 to 1000
DECLARE
i NUMBER := &i;
reminder NUMBER := 0;
res NUMBER := 0;
temp NUMBER := i;

BEGIN
While i <=1000 loop
temp := i;
res := 0;
While temp !=0 loop
reminder := MOD(temp,10);
res :=res + (reminder * reminder * reminder);

temp := TRUNC(temp / 10);
END loop;
If i = res THEN
DBMS_Output.Put_Line(i);
END if;
i := i + 1;
END loop;
END;
/ 