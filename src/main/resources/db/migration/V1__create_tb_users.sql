CREATE TABLE users (
    id CHAR(36) PRIMARY KEY,
    username VARCHAR(50) NOT NULL UNIQUE,
    name VARCHAR(150),
    password VARCHAR(255) NOT NULL,
    created_at TIMESTAMP
);
