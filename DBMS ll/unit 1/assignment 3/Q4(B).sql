--Create a trigger on product table for after insert and back up the new data in new table Product_new.
CREATE TABLE Product3_new(
Prod_id VARCHAR2(50) PRIMARY KEY,
Prod_name VARCHAR2(50),
Prod_amt NUMBER(10,2),
Prod_comp VARCHAR2(50),
Prod_mfgdate DATE,
Prod_expdate DATE,
Inserted_at TIMESTAMP DEFAULT SYSTIMESTAMP
); 

--create an after insert
CREATE OR REPLACE TRIGGER after_Product15_insert
AFTER Insert ON Product15
FOR EACH ROW
BEGIN
  --Backup
  Insert into Product3_new (Prod_id,Prod_name,Prod_amt,Prod_comp,Prod_mfgdate,Prod_expdate,Inserted_at) Values (;NEW.Prod_id,:NEW.Prod_name,:NEW.Prod_amt,NEW.Prod_comp,:NEW.Prod_mfgdate,:NEW.Prod_expdate,SYSTIMESTAMP);
  END;
  /

  --Test
  Insert into Product15 (Prod_id,Prod_name,Prod_amt,Prod_comp,Prod_mfgdate,Prod_expdate) Values ('P106','Cream',120.00,'Company F',TO_DATE('2024-03-05', 'YYYY-MM-DD'),TO_DATE('2026-03-05', 'YYYY-MM-DD'));

  --check
  select * from Product3_new;