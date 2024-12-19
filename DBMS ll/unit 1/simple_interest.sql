--write a program to calculate simple interest
Declare
    principle integer :=(10000);
    interest float :=(3.5);
    year integer :=(3);
    si double precision :=(0);
BEGIN
    si :=(principle*interest*year)/100;
    DBMS_output.put_line('Simple INterest is '||si);
end;
/