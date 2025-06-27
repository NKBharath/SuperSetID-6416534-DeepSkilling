-- Creating tables
CREATE TABLE customers (
    customer_id NUMBER PRIMARY KEY,
    f_name VARCHAR2(50),
    age NUMBER,
    balance NUMBER,
    isVIP VARCHAR2(5)
);

CREATE TABLE loans (
    loan_id NUMBER PRIMARY KEY,
    customer_id NUMBER,
    interest_rate NUMBER,
    due_date DATE,
    FOREIGN KEY (customer_id) REFERENCES customers(customer_id)
);

-- Inserting sample data
INSERT INTO customers VALUES (1, 'Arun', 65, 15000, 'FALSE');
INSERT INTO customers VALUES (2, 'Priya', 45, 5000, 'FALSE');
INSERT INTO customers VALUES (3, 'Ravi', 70, 12000, 'FALSE');

INSERT INTO loans VALUES (101, 1, 10.5, SYSDATE + 15);
INSERT INTO loans VALUES (102, 2, 11.0, SYSDATE + 45);
INSERT INTO loans VALUES (103, 3, 9.5, SYSDATE + 5);

-- Save changes
COMMIT;
BEGIN
    FOR c IN (SELECT customer_id FROM customers WHERE age > 60) LOOP
        UPDATE loans
        SET interest_rate = interest_rate - 1
        WHERE customer_id = c.customer_id;
    END LOOP;

    COMMIT;
END;

SELECT customer_id, interest_rate FROM loans;
