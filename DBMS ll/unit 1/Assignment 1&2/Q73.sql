-- 73.Accept a string and print in the following format
-- O
-- OR
-- ORA
-- ORAC
-- ORACL
-- ORACLE
DECLARE
s VARCHAR(20) := 'ORACLE';
v VARCHAR(20);
BEGIN
for i in 1 .. Length(s) loop
    v :=SUBSTR(s,1,i);
    DBMS_Output.Put_Line(v);
    END loop;
END;
/