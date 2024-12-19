--write a program to print total salary
Declare
    salary float :=(10000);
    Hra integer :=(5000);
    Da integer :=(3000);
    Ta integer :=(30000);
    Pf integer :=(1000);
    totalsalary float;
BEGIN
    totalsalary :=salary+Hra+Da+Ta+Pf;
    DBMS_output.put_line('Total Salary is '||totalsalary);
end;
/