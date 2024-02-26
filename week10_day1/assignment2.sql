-- Task I: Create a new table called "orders"
CREATE TABLE orders (
    order_id INT AUTO_INCREMENT PRIMARY KEY,
    customer_id INT NOT NULL,
    total_amount DECIMAL(10, 2) NOT NULL
);

-- Task II: Implement a transaction to insert a new order into the "orders" table and update the customer's balance
START TRANSACTION;

-- Insert a new order into the "orders" table
INSERT INTO orders (customer_id, total_amount)
VALUES (123, 50.00); -- Example values for customer_id and total_amount

-- Update the customer's balance in the "customers" table
UPDATE customers
SET balance = balance - 50.00 -- Subtract the order total from the customer's balance
WHERE customer_id = 123; -- Example customer_id

COMMIT;

-- Task III: Extend the transaction to include a savepoint and rollback to the savepoint if there is an error in inserting the order
START TRANSACTION;

-- Set a savepoint
SAVEPOINT insert_order;

-- Insert a new order into the "orders" table
INSERT INTO orders (customer_id, total_amount)
VALUES (123, 50.00); -- Example values for customer_id and total_amount

-- Check if the order insertion was successful
IF @@ROWCOUNT = 0 THEN
    -- Rollback to the savepoint if no rows were affected (i.e., insertion failed)
    ROLLBACK TO insert_order;
ELSE
    -- Update the customer's balance in the "customers" table
    UPDATE customers
    SET balance = balance - 
