-- Работа с несколькими таблицами/Домашнее задание
-- Задание 1

create table city(city_id bigserial not null primary key ,city_name varchar(50) not null );

alter table employee add column city_id bigint references city (city_id);

insert into city(city_name) values('Москва'), ('Воронеж'), ('Краснодар');

update employee set city_id = 1 where id >0 and id <3;
update employee set city_id = 2 where id >2 and id <4;
update employee set city_id = 3 where id >3 and id <7;

--Задание 2

select e.first_name, e.last_name, c.city_name from employee e inner join city c on e.city_id = c.city_id;

insert into employee (first_name, last_name, gender, age) values ('Denis', 'Denisov', 'male', 33);

insert into city(city_name) values('Сочи');

select e.first_name, e.last_name, c.city_name from employee e right join city c on e.city_id = c.city_id;

select e.first_name, e.last_name, c.city_name from employee e full join city c on e.city_id = c.city_id;

select e.first_name, e.last_name, c.city_name from employee e cross join city c;



