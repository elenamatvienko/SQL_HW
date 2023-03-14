/*
postgres=# CREATE DATABASE skypro;
        CREATE DATABASE
        postgres=# \c skypro
        Вы подключены к базе данных "skypro" как пользователь "postgres".
        skypro=# CREATE TABLE employee (
        skypro(# id BIGSERIAL NOT NULL PRIMARY KEY,
        skypro(# first_name VARCHAR(50) NOT NULL,
        skypro(# last_name VARCHAR(50) NOT NULL,
        skypro(# gender VARCHAR(6) NOT NULL,
        skypro(# age INT NOT NULL
        skypro(# );
        CREATE TABLE
        skypro=# INSERT INTO employee (
        skypro(# first_name, last_name, gender, age)
        skypro-# VALUES ('Ivan', 'Ivanov', 'muzh', 33);
        INSERT 0 1
        skypro=#  INSERT INTO employee (
        skypro(# first_name, last_name, gender, age)
        skypro-# VALUES ('Irina', 'Ivanova', 'zhen', 30);
        INSERT 0 1
        skypro=# INSERT INTO employee (
        skypro(# first_name, last_name, gender, age)
        skypro-# VALUES ('Inna', 'Petrova', 'zhen', 30);
        INSERT 0 1
        skypro=# SELECT * FROM employee;
        id | first_name | last_name | gender | age
        ----+------------+-----------+--------+-----
        1 | Ivan       | Ivanov    | muzh   |  33
        2 | Irina      | Ivanova   | zhen   |  30
        3 | Inna       | Petrova   | zhen   |  30
        (3 строки)


        skypro=# UPDATE employee SET first_name = 'Alina', last_name = 'Vasina', gender = 'zhen', age = 39 WHERE id = 1;
        UPDATE 1
        skypro=# SELECT * FROM employee;
        id | first_name | last_name | gender | age
        ----+------------+-----------+--------+-----
        2 | Irina      | Ivanova   | zhen   |  30
        3 | Inna       | Petrova   | zhen   |  30
        1 | Alina      | Vasina    | zhen   |  39
        (3 строки)

        skypro=# DELETE FROM employee WHERE id = 2;
        DELETE 1
        skypro=# SELECT * FROM employee;
        id | first_name | last_name | gender | age
        ----+------------+-----------+--------+-----
        3 | Inna       | Petrova   | zhen   |  30
        1 | Alina      | Vasina    | zhen   |  39
        (2 строки)


        skypro=#*/
