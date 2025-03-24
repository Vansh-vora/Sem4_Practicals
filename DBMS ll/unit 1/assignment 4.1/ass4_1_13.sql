--Create a function to find a factorial of a number.

create or replace function fact(x number)
return number
is 
f number;
BEGIN
  if x=0 then
  f:=1;
  else
    f:=x*fact(x-1);
  END if;
  return f;
END;  
/

DECLARE
num Number;
factorial number;
BEGIN
  num:=6;
  factorial:=fact(num);
  DBMS_OUTPUT.PUT_LINE('Factorial '||num||'is'|| factorial);
END;
/