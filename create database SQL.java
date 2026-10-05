create database First;
use First;
create table Students(
id int ,
name varchar(60) not null unique,
age int primary key
);

insert into Students values(1,"Divya",28),(2,"lakshmi",27),(3,"bhavani",29);
delete from Students where age=25;

select * from Students;
select name from students;