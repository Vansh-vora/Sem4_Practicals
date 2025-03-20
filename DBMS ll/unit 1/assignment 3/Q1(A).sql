--Create a table Product with column name (Prod_id, Prod_name, Prod_amt, Prod_comp, 
--Prod_mfgdate, Prod_expdate). Insert at least 5 records. 

-- Create Table name Product.
CREATE TABLE Product12(
Prod_id NUMBER PRIMARY KEY,
Prod_name VARCHAR2(50),
Prod_amt NUMBER(10,2),
Prod_comp VARCHAR2(50),
Prod_mfgdate DATE,
Prod_expdate DATE
);

-- Insert 5 Records
Insert into Product12 (Prod_id,Prod_name,Prod_amt,Prod_comp,Prod_mfgdate,Prod_expdate)
Values (1,'Soap',50.00,'Company A',TO_DATE('2024-01-01','YYYY-MM-DD'),TO_DATE('2025-01-01', 'YYYY-MM-DD'));
Insert into Product12 (Prod_id,Prod_name,Prod_amt,Prod_comp,Prod_mfgdate,Prod_expdate)
Values (2,'Sampoo',350.00,'Company B',TO_DATE('2024-10-01','YYYY-MM-DD'),TO_DATE('2025-10-01', 'YYYY-MM-DD'));
Insert into Product12 (Prod_id,Prod_name,Prod_amt,Prod_comp,Prod_mfgdate,Prod_expdate)
Values (3,'Toothpaste',150.00,'Company C',TO_DATE('2024-11-01','YYYY-MM-DD'),TO_DATE('2025-11-01', 'YYYY-MM-DD'));
Insert into Product12 (Prod_id,Prod_name,Prod_amt,Prod_comp,Prod_mfgdate,Prod_expdate)
Values (4,'Brush',30.00,'Company D',TO_DATE('2024-09-01','YYYY-MM-DD'),TO_DATE('2025-09-01', 'YYYY-MM-DD'));
Insert into Product12 (Prod_id,Prod_name,Prod_amt,Prod_comp,Prod_mfgdate,Prod_expdate)
Values (5,'FaceWash',250.00,'Company E',TO_DATE('2024-08-01','YYYY-MM-DD'),TO_DATE('2025-08-01', 'YYYY-MM-DD'));

--To see Table 
--select * from Product12;