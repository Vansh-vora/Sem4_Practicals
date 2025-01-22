-- 89.Write a program to print the following series
-- 1
-- 1 2
-- 1 2 3
-- 1 2 3 4
-- 1 2 3 4 5
BEGIN
for i in 1 .. 5 loop
    for j in 1 .. i loop
        DBMS_Output.Put(j||' ');
        END loop;
        DBMS_Output.New_Line;
    END loop;
END;
