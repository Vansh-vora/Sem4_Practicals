--Create a trigger on product table for before upodate and back up the old data in new table Product_new. Condition for deletion: Where Product Id=’P105’ and change the product expdate.
CREATE TABLE Product5_new(
Prod_id VARCHAR2(50) PRIMARY KEY,
Prod_name VARCHAR2(50),
Prod_amt NUMBER(10,2),
Prod_comp VARCHAR2(50),
Prod_mfgdate DATE,
Prod_expdate DATE,
Updated_at TIMESTAMP DEFAULT SYSTIMESTAMP
); 

-- create trigger
CREATE OR REPLACE trigger before_Product17_update
before UPDATE on Product17
FOR EACH ROW
BEGIN
  IF :OLD.Prod_id="P105" and :OLD.Prod_expdate <> :NEW.Prod_expdate THEN
  Insert into Product5_new (Prod_id,Prod_name,Prod_amt,Prod_comp,Prod_mfgdate,Prod_expdate,Updated_at) Values (:OLD.Prod_id,:OLD.Prod_name,:OLD.Prod_amt,:OLD.Prod_comp,:OLD.Prod_mfgdate,:OLD.Prod_expdate,SYSTIMESTAMP);
  END IF;
  END;
  /

--Update
UPDATE Product17
SET Prod_expdate= TO_DATE('2026-10-10','YYYY-MM-DD')
where Prod_id='P105';

--check
select * from Product5_new;
