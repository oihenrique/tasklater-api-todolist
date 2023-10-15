CREATE TABLE tasks (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    description VARCHAR(255),
    title VARCHAR(255),
    priority VARCHAR(100),
    start_at DATE,
    end_at DATE,
    id_User CHAR(36),
    created_at TIMESTAMP,

    FOREIGN KEY (id_User) REFERENCES users (id)
);
