-- 24. Write a program to calculate the area of a circle by accepting the radius and unit of measure 
DECLARE
rad NUMBER := &rad;
area NUMBER(7,2);
BEGIN
area := (22 / 7) * rad * rad;
DBMS_Output.Put_Line('The area is :' || area);
END;
/