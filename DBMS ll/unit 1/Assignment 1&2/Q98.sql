-- 98. Write a program to print the following series
--  *
--  * *
--  * * *
--  * * * *
--  * * * * *
BEGIN
for i in 1 .. 5 loop
    for j in 1 .. i loop
    DBMS_Output.Put(' * ');
    END loop;
    DBMS_Output.New_Line;
    END loop;
END;
/