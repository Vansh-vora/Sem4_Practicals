-- 97. Write a program to print the following series
--  1
--  0 1
--  1 0 1
--  0 1 0 1
--  1 0 1 0 1
BEGIN
for i in 1 .. 5 loop
for j in 1 .. i loop
DBMS_Output.Put(MOD(j,2) || ' ');
END loop;
DBMS_Output.New_Line;
END loop;
END;
/