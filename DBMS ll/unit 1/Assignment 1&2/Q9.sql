-- 9. Write a program to accept a number and find how many digits it contain
DECLARE
n NUMBER(5):= &n;
counter NUMBER := 0;
reminder NUMBER(2) := 0;

BEGIN
While n != 0 loop
reminder := MOD(n,10);
counter := counter + 1;
n := n / 10;
END loop;
DBMS_Output.Put_Line('Number of Digits of given number is:'|| counter);
END;
/
