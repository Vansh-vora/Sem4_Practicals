-- 95. Write a program to print the following series
--  5 5 5 5 5
--  4 4 4 4
--  3 3 3
--  2 2
--  1
BEGIN
for i in Reverse 1 .. 5 loop
    for j in Reverse 1 .. i loop
    DBMS_Output.Put(i || ' ');
    END loop;
    DBMS_Output.New_Line;
    END loop;
END;
/