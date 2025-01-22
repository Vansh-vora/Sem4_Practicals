-- 23. Write a program to calculate the area of a triangle by accepting the 3 sides
DECLARE
a NUMBER := &a;
b NUMBER := &b;
c NUMBER := &c;
s NUMBER := (a+b+c) / 2;
area NUMBER(7,2);
BEGIN
area := SQRT(s * (s - a) * (s - b) * (s - c));
DBMS_Output.Put_Line('The area is:' || area);
END;
/