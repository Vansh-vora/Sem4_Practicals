--Create user defined an Exception and raise it: Find maximum from 3 no.

DECLARE
  a int;  
  b int;
  c int;
  num Exception;

BEGIN
  a:=&a;
  b:=&b;
  c:=&c;
if (a>b and a>c) then
  DBMS_OUTPUT.PUT_LINE('Max: '||a);
elsif (b>a and b>c) then
  DBMS_OUTPUT.PUT_LINE('Max: '||b);
elsif(c>a and c>b)then
  DBMS_OUTPUT.PUT_LINE('Max: '||c);
else
  raise num;
end if;
Exception
  when num then 
    DBMS_OUTPUT.PUT_LINE('All are equal');
END;
/