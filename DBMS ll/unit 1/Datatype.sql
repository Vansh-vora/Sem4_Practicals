--Write a program to use different datatype
Declare
    roll integer :=(10);
    name varchar(5) :=('vansh');
    bin binary_integer :=(0);
    msg varchar2(20) DEFAULT 'Have a Good Day';
    salary number(10,2);
    pi CONSTANT double precision :=(3.1426);
    address varchar2(100);
    birth DATE :=('01-jan-2025');
    current_date DATE :=SYSDATE;
    sqr CONSTANT number(5,2) :=(56.02);
    f real;
BEGIN
    DBMS_output.put_line('Roll='||roll);
    DBMS_output.put_line('Bin='||bin);
    DBMS_output.put_line('Message='||msg);

    DBMS_output.put_line('Salary='||salary);
    DBMS_output.put_line('pi='||pi);
    DBMS_output.put_line('Address='||address);
    DBMS_output.put_line('Birth='||birth);
    DBMS_output.put_line('Date='||current_date);
    DBMS_output.put_line('SQR='||sqr);
    DBMS_output.put_line('Name='||name);
end;
/
