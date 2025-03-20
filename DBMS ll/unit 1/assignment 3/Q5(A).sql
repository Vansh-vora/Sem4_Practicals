--Create a table Product with column name (Prod_id, Prod_name, Prod_amt, Prod_comp, Prod_mfgdate, Prod_expdate). Insert at least 5 records.
CREATE TABLE Product16(
Prod_id VARCHAR2(50) PRIMARY KEY,
Prod_name VARCHAR2(50),
Prod_amt NUMBER(10,2),
Prod_comp VARCHAR2(50),
Prod_mfgdate DATE,
Prod_expdate DATE
);

BEGIN
-- Insert 5 Records
Insert into Product16 (Prod_id,Prod_name,Prod_amt,Prod_comp,Prod_mfgdate,Prod_expdate)
Values ('P100','Soap',50.00,'Company A',TO_DATE('2024-01-01','YYYY-MM-DD'),TO_DATE('2025-01-01', 'YYYY-MM-DD'));
Insert into Product16 (Prod_id,Prod_name,Prod_amt,Prod_comp,Prod_mfgdate,Prod_expdate)
Values ('P101','Sampoo',350.00,'Company B',TO_DATE('2024-10-01','YYYY-MM-DD'),TO_DATE('2025-10-01', 'YYYY-MM-DD'));
Insert into Product16 (Prod_id,Prod_name,Prod_amt,Prod_comp,Prod_mfgdate,Prod_expdate)
Values ('P102','Toothpaste',150.00,'Company C',TO_DATE('2024-11-01','YYYY-MM-DD'),TO_DATE('2025-11-01', 'YYYY-MM-DD'));
Insert into Product16 (Prod_id,Prod_name,Prod_amt,Prod_comp,Prod_mfgdate,Prod_expdate)
Values ('P103','Brush',30.00,'Company D',TO_DATE('2024-09-01','YYYY-MM-DD'),TO_DATE('2025-09-01', 'YYYY-MM-DD'));
Insert into Product16 (Prod_id,Prod_name,Prod_amt,Prod_comp,Prod_mfgdate,Prod_expdate)
Values ('P104','FaceWash',250.00,'Company E',TO_DATE('2024-08-01','YYYY-MM-DD'),TO_DATE('2025-08-01', 'YYYY-MM-DD'));
END;
/
--To see Table 
select * from Product16;