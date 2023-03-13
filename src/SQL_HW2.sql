-- Выборка данных и вложенные запросы/Домашнее задание
-- Задание 1
--1
insert into employee (first_name, last_name, gender, age) values ('Petr', 'Chernov', 'male', 53);
insert into employee (first_name, last_name, gender, age) values ('Semen', 'Kotov', 'male', 43);
insert into employee (first_name, last_name, gender, age) values ('Irina', 'Ivanova', 'female', 30);
--2
select first_name AS Имя, last_name AS Фамилия from employee;
--3
select * from employee WHERE age < 30 OR age > 50;
--4
select * from employee WHERE age BETWEEN 30 AND 50;
--5
select * from employee ORDER BY last_name DESC;
--6
select *from employee WHERE length(first_name) > 4;

-- Задание 2
--1
UPDATE employee SET first_name = 'Petr' WHERE id = 5;
UPDATE employee SET first_name = 'Irina' WHERE id = 4;
--2
select first_name AS Имя, sum(age) AS Суммарный_возраст from employee GROUP BY first_name;
--3
select first_name AS Имя, min(age) AS Юный_возраст from employee GROUP BY first_name;
--4
select first_name AS Имя, max(age) AS max_age from employee GROUP BY first_name
        HAVING count(*) > 1 ORDER BY max_age;