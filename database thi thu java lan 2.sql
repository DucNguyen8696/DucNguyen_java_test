CREATE DATABASE Final_Exam_5;

USE Final_Exam_5;

CREATE TABLE 	`user`(
	id int auto_increment primary key,
    full_name varchar(255) not null,
    email varchar(255) unique not null,
    `password` varchar(255) not null,
    exp_in_year tinyint,
    pro_skill varchar(255),
    project_id int,
    role enum('manager','employee','admin') default 'employee'
    );
    
insert into user (id, full_name, email, password) values (1, 'Hortensia', 'hgolledge0@webnode.com', 'EJa81e1EV');
insert into user (id, full_name, email, password) values (2, 'Carmine', 'cbetke1@spotify.com', 'r5RMwT');
insert into user (id, full_name, email, password) values (3, 'Thadeus', 'tlarciere2@about.me', 'Db3KEX');
insert into user (id, full_name, email, password) values (4, 'Douglas', 'dcyster3@gnu.org', 'Rt7HMvSl');
insert into user (id, full_name, email, password) values (5, 'Lewie', 'lwaylen4@ebay.com', '38J35j8awRHG');
insert into user (id, full_name, email, password) values (6, 'Valeria', 'vlowder5@globo.com', 'WwS0OmLVB');
insert into user (id, full_name, email, password) values (7, 'Helenka', 'hjudd6@bravesites.com', 'BWxL4UMoYhbA');
insert into user (id, full_name, email, password) values (8, 'Stanislaus', 'sfleischer7@bizjournals.com', 'zX4sVqG');
insert into user (id, full_name, email, password) values (9, 'Krispin', 'kbligh8@sfgate.com', '8aElZF');
insert into user (id, full_name, email, password) values (10, 'Carr', 'ceginton9@mashable.com', 'H4TV7A');