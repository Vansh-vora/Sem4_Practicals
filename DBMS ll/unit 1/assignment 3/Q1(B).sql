--Create a trigger on product table for after delete and back up the old data in new table 
--Product_new. Condition for deletion: Where Product name=’Soap’.

--Create a new Product table for backup
CREATE TABLE Product_new(
Prod_id NUMBER PRIMARY KEY,
Prod_name VARCHAR2(50),
Prod_amt NUMBER(10,2),
Prod_comp VARCHAR2(50),
Prod_mfgdate DATE,
Prod_expdate DATE,
Deleted_at TIMESTAMP DEFAULT SYSTIMESTAMP
);

--Create a trigger to backup deleted records where Prod_name='Soap'
CREATE OR REPLACE TRIGGER after_product12_delete
AFTER DELETE ON Product12
FOR EACH ROW
BEGIN
 --Only Backup records where Prod_name is 'Soap'
 IF :OLD.Prod_name ='Soap' THEN
 Insert into Product_new (Prod_id,Prod_name,Prod_amt,Prod_comp,Prod_mfgdate,Prod_expdate,Deleted_at) Values (:OLD.Prod_id,:OLD.Prod_name,:OLD.Prod_amt,:OLD.Prod_comp,:OLD.Prod_mfgdate,:OLD.Prod_expdate,SYSTIMESTAMP);
 END IF;
 END;
 /

 --Test Deletation
DELETE from Product12 Where Prod_name='Soap';

--Check backed-up records
select * from Product_new;