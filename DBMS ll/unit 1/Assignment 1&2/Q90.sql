-- 90. Write a program to print the following series
-- 1
-- 2 1
-- 3 2 1
-- 4 3 2 1
-- 5 4 3 2 1
BEGIN
for i in 1 .. 5 loop
    for j in Reverse 1 .. i loop
    DBMS_Output.Put(j|| ' ');
    END loop;
    DBMS_Output.New_Line;
END loop;
END;
/