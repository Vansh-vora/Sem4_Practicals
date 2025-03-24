--Create a function to calculate reverse of a number. 
Create or replace function rev(n in number)
return number
is
num number:=n;
rev_num number:=0;
BEGIN
while(num>0) LOOP
rev_num:=(rev_num*10)+mod(num,10);
num:=TRUNC(num/10);
end LOOP;
return rev_num;
END;
/
DECLARE
ans number;
BEGIN
ans:=rev(345);
DBMS_OUTPUT.PUT_LINE('Reverse Number: '||ans);
END;
/



