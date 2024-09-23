-- Cria o banco de dados de teste
CREATE DATABASE customers_db;

\c testdb;

-- Cria uma tabela de clientes
CREATE TABLE customers (
    id SERIAL PRIMARY KEY,
    name VARCHAR(100),
    email VARCHAR(100),
    account_number VARCHAR(20) UNIQUE,
    balance DECIMAL(15, 2) DEFAULT 0.00 -- Saldo inicial
);

-- Cria uma tabela de transações bancárias
CREATE TABLE transactions (
    id SERIAL PRIMARY KEY,
    customer_id INT REFERENCES customers(id),
    transaction_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    transaction_type VARCHAR(10), -- 'credit' ou 'debit'
    amount DECIMAL(15, 2), -- Valor da transação
    description VARCHAR(255)
);

-- Insere alguns clientes de exemplo
INSERT INTO customers (name, email, account_number, balance) VALUES
('Alice', 'alice@example.com', '1234567890', 1000.00),
('Bob', 'bob@example.com', '0987654321', 500.00),
('Carol', 'carol@example.com', '1122334455', 1500.00);

-- Insere algumas transações bancárias de exemplo
INSERT INTO transactions (customer_id, transaction_type, amount, description) VALUES
(1, 'credit', 200.00, 'Depósito em caixa eletrônico'),
(1, 'debit', 50.00, 'Pagamento de conta de luz'),
(2, 'debit', 100.00, 'Compra no supermercado'),
(3, 'credit', 500.00, 'Transferência recebida'),
(3, 'debit', 200.00, 'Pagamento de aluguel');
