--Retrieve employee details for a given department ID using a cursor.

--create a table
create table EMPLOYEES2(Dept_ID number,name varchar2(50));

Begin
  insert into EMPLOYEES2(Dept_ID,name)values(1,'Vansh');
  insert into EMPLOYEES2(Dept_ID,name)values(2,'Aagam');
END;
/

DECLARE
  c_Deptid EMPLOYEES2.Dept_ID%type;
  c_name EMPLOYEES2.name%type;

  Cursor c is select Dept_ID,name from EMPLOYEES2 where Dept_ID=1;

Begin
  OPEN c;
  LOOP
    fetch c into c_Deptid,c_name;
    exit when c%notfound;
    DBMS_OUTPUT.PUT_LINE('DEPT_ID: '||c_Deptid||'name: '||c_name);
    END LOOP;
  close c;
END;
/
