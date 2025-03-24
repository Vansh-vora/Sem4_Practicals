--Create an Exception, if one numbe ris divide by zero. 

DECLARE
a int;
b int;
c int;

BEGIN
  a:=&a;
  b:=&b;
  c:=a/b;
  DBMS_OUTPUT.PUT_LINE('Answer: '||c);
Exception
  when zero_divide then  
      DBMS_OUTPUT.PUT_LINE('Error: Cant divide by zero');
  
END;
/
