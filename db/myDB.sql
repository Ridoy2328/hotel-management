CREATE DATABASE hotelmanagementsystem;
 show databases;
 
 use hotelmanagementsystem;
 
 create table login(username varchar(30), password varchar(25));
 
 insert into login values('admin', '12345');
 select * from login;
 
 create table employee(name varchar(25), age varchar(10), gender varchar(15), job varchar(30), salary varchar(15), phone varchar(15), email varchar(40), nid varchar(20));
 
 describe employee;
 
 select * from employee;
 
 create table room(roomnumber varchar(10), availability varchar(20), cleaning_status varchar(20), price varchar(20), bed_type varchar(20));
 
 select * from room;
 
 create table driver(name varchar(20), age varchar(10), gender varchar(15), company varchar(20), brand varchar(20), available varchar(20), location varchar(40));
 
 describe driver;
 
 Select * from driver;
 
 create table customer(document varchar(20), number varchar(30), name varchar(15), gender varchar(15), country varchar(20), room varchar(10), checkintime varchar(80), deposit varchar(20));
 
 select * from customer;
 
create table department(department varchar(30), budget varchar(30));

insert into department values('Front office','500000'),('Housekeeping','40000'),('Food and Beverage','23000'),('Kitchen or Food Production','540000'),('Security','320000');

insert into employee values ('Pankaj Tripathi','35','Male','Chefs','35000','4563256325','pankaj@gmail.com','456325632569');
insert into customer values('Nid','456325896541','Samwell','Male','India','102','thu Apr 07 14:10:5','1000');

insert into customer values('Passport','45632589654D','Jhon','Male','US','101','thu march 07 14:10:5','2000');

insert into room values('101','Occupied','Cleaned','2100','Double Bed'),('102','Occupied','Cleaned','3600','Single Bed'),('103','Occupied','Cleaned','4000','Double Bed'),('104','Available','Cleaned','2100','Double Bed');