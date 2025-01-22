-- 94. Write a program to print the following series
--  5 4 3 2 1
--  5 4 3 2
--  5 4 3
--  5 4
--  5
BEGIN
for i in 1 .. 5 loop
    for j in Reverse i .. 5 loop
    DBMS_Output.Put(j || ' ');
    END loop;
    DBMS_Output.New_Line;
    END loop;
END;
/