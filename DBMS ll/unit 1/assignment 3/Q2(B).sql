--Create a trigger on product table for before delete and back up the new data in new table 
--Product_new. Condition for deletion: Where Product Id=’P103’.
CREATE TABLE Product1_new(
Prod_id VARCHAR2(50) PRIMARY KEY,
Prod_name VARCHAR2(50),
Prod_amt NUMBER(10,2),
Prod_comp VARCHAR2(50),
Prod_mfgdate DATE,
Prod_expdate DATE,
Deleted_at TIMESTAMP DEFAULT SYSTIMESTAMP
);
--Create a before delete trigger to back up records before deletation
CREATE OR REPLACE TRIGGER before_Product13_delete
BEFORE DELETE on Product13
for EACH ROW
BEGIN

--Only Backup records where Prod_id='P103'
IF :OLD.Prod_id = 'P103' THEN
Insert into Product1_new (Prod_id,Prod_name,Prod_comp,Prod_amt,Prod_mfgdate,Prod_expdate,Deleted_at) Values (:OLD.Prod_id,:OLD.Prod_name,:OLD.Prod_comp,:OLD.Prod_amt,:OLD.Prod_mfgdate,:OLD.Prod_expdate,SYSTIMESTAMP);
END IF;
END;
/

--Test Deletation
DELETE from Product13 where Prod_id='P103';

--Check Backup record
select * from Product1_new;