--Create a trigger on product table for before insert and back up the old data in new table Product_new.
CREATE TABLE Product2_new(
Prod_id VARCHAR2(50) PRIMARY KEY,
Prod_name VARCHAR2(50),
Prod_amt NUMBER(10,2),
Prod_comp VARCHAR2(50),
Prod_mfgdate DATE,
Prod_expdate DATE,
Inserted_at TIMESTAMP DEFAULT SYSTIMESTAMP
); 

--create a before insert trigger to back up existing records before new insertion
CREATE OR REPLACE TRIGGER before_Product14_insert
BEFORE insert ON Product14
FOR EACH ROW
BEGIN
--Backup all existing record before inserting a new one 
Insert into Product2_new(Prod_id,Prod_name,Prod_amt,Prod_comp,Prod_mfgdate,Prod_expdate,Inserted_at) select Prod_id,Prod_name,Prod_amt,Prod_comp,Prod_mfgdate,Prod_expdate,SYSTIMESTAMP from Product14;
END;
/

--Test Insertion
Insert into Product14 (Prod_id,Prod_name,Prod_amt,Prod_comp,Prod_mfgdate,Prod_expdate) Values ('P106','Cream',120.00,'Company F',TO_DATE('2024-03-05', 'YYYY-MM-DD'),TO_DATE('2026-03-05', 'YYYY-MM-DD'));

--Check 
select * from Product2_new;