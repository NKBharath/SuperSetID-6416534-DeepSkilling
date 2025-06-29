CREATE TABLE accounts (
    account_id NUMBER PRIMARY KEY,
    account_type VARCHAR2(20),
    balance NUMBER
);
INSERT INTO accounts VALUES (101, 'SAVINGS', 10000);
INSERT INTO accounts VALUES (102, 'SAVINGS', 15000);
INSERT INTO accounts VALUES (103, 'CURRENT', 12000);

COMMIT;

CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest
IS
BEGIN
    UPDATE accounts
    SET balance = balance + (balance * 0.01)
    WHERE account_type = 'SAVINGS';

    COMMIT;
END;

SELECT * FROM accounts;

BEGIN
    ProcessMonthlyInterest;
END;

SELECT * FROM accounts;

CREATE TABLE employees (
    employee_id NUMBER PRIMARY KEY,
    employee_name VARCHAR2(50),
    department_id NUMBER,
    salary NUMBER
);

INSERT INTO employees VALUES (1, 'Arun', 10, 30000);
INSERT INTO employees VALUES (2, 'Bharath', 10, 40000);
INSERT INTO employees VALUES (3, 'Priya', 20, 35000);
COMMIT;


CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus (
    p_dept_id NUMBER,
    p_bonus_percent NUMBER
)
IS
BEGIN
    UPDATE employees
    SET salary = salary + (salary * p_bonus_percent / 100)
    WHERE department_id = p_dept_id;

    COMMIT;
END;

BEGIN
    UpdateEmployeeBonus(10, 10);
END;

SELECT * FROM employees;



CREATE OR REPLACE PROCEDURE TransferFunds (
    p_from_account_id NUMBER,
    p_to_account_id NUMBER,
    p_amount NUMBER
)
IS
    v_balance NUMBER;
BEGIN
    SELECT balance INTO v_balance
    FROM accounts
    WHERE account_id = p_from_account_id;

    IF v_balance >= p_amount THEN
        UPDATE accounts
        SET balance = balance - p_amount
        WHERE account_id = p_from_account_id;

        UPDATE accounts
        SET balance = balance + p_amount
        WHERE account_id = p_to_account_id;

        COMMIT;
    ELSE
        RAISE_APPLICATION_ERROR(-20001, 'Insufficient balance');
    END IF;
END;

BEGIN
    TransferFunds(101, 202, 500);
END;


