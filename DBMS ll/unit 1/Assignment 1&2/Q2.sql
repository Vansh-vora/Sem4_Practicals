--2. Write a program to print the numbers from 1 to 100.
DECLARE
I NUMBER :=1;

BEGIN
While I <= 100 Loop
DBMS_Output.Put_Line(I);
I := I + 1;
END Loop;

END;
/
