--Create a trigger on product table for after update and back up the new data in new table Product_new. Condition for deletion: Where Product Id=’P100’ and change the product company name.
CREATE TABLE Product4_new(
Prod_id VARCHAR2(50) PRIMARY KEY,
Prod_name VARCHAR2(50),
Prod_amt NUMBER(10,2),
Prod_comp VARCHAR2(50),
Prod_mfgdate DATE,
Prod_expdate DATE,
Updated_at TIMESTAMP DEFAULT SYSTIMESTAMP
); 

--create trigger
Create OR REPLACE TRIGGER after_Product16_update
after update on Product16
FOR EACH ROW
BEGIN
  --check if the updated record has prod_id='p100' and Prod_comp is changed 
  IF :OLD.Prod_id='P100' and :OLD.Prod_comp <> :NEW.Prod_comp THEN
    Insert into Product4_new (Prod_id,Prod_name,Prod_amt,Prod_comp,Prod_mfgdate,Prod_expdate,Updated_at) Values (:NEW.Prod_id,:NEW.Prod_name,:NEW.Prod_amt,:NEW.Prod_comp,:NEW.Prod_mfgdate,:NEW.Prod_expdate,SYSTIMESTAMP);
  END IF;
  END;
  /

  --Test
  UPDATE Product16
  SET Prod_comp = 'Company X'
  Where Prod_id ='P100';

  --Check
  select * from Product4_new;