-- 22.Write a program to accept the temp in Centigrade and convert it into Fahrenheit(c=F-32/1.8)
DECLARE
cel FLOAT := &cel;
f FLOAT;
BEGIN
f := (cel * 1.8) + 32;
DBMS_Output.Put_Line(cel || 'C if' || f || 'F');
END;
/