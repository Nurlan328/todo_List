DROP TABLE IF EXISTS Task;
DROP DATABASE IF EXISTS todo_db;

CREATE DATABASE todo_db;

CREATE TABLE Task(
    id int PRIMARY KEY,
    name VARCHAR(20),
    description VARCHAR(50),
    status VARCHAR(50),
    priority VARCHAR(50),
    date data
)