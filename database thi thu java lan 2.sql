CREATE DATABASE Final_Exam_5;

USE Final_Exam_5;

CREATE TABLE 	`user`(
	id INT AUTO_INCREMENT PRIMARY KEY,
    full_name VARCHAR(255) NOT NULL,
    email VARCHAR(255) UNIQUE NOT NULL,
    `password` VARCHAR(255) NOT NULL,
    exp_in_year TINYINT,
    pro_skill VARCHAR(255),
    project_id INT,
    role ENUM('manager','employee','admin') DEFAULT 'employee'
    );
    
INSERT INTO USER (id, full_name, email, password) VALUES (1, 'Hortensia', 'hgolledge0@webnode.com', 'EJa81e1EV');
INSERT INTO USER (id, full_name, email, password) VALUES (2, 'Carmine', 'cbetke1@spotify.com', 'r5RMwT');
INSERT INTO USER (id, full_name, email, password) VALUES (3, 'Thadeus', 'tlarciere2@about.me', 'Db3KEX');
INSERT INTO USER (id, full_name, email, password) VALUES (4, 'Douglas', 'dcyster3@gnu.org', 'Rt7HMvSl');
INSERT INTO USER (id, full_name, email, password) VALUES (5, 'Lewie', 'lwaylen4@ebay.com', '38J35j8awRHG');
INSERT INTO USER (id, full_name, email, password) VALUES (6, 'Valeria', 'vlowder5@globo.com', 'WwS0OmLVB');
INSERT INTO USER (id, full_name, email, password) VALUES (7, 'Helenka', 'hjudd6@bravesites.com', 'BWxL4UMoYhbA');
INSERT INTO USER (id, full_name, email, password) VALUES (8, 'Stanislaus', 'sfleischer7@bizjournals.com', 'zX4sVqG');
INSERT INTO USER (id, full_name, email, password) VALUES (9, 'Krispin', 'kbligh8@sfgate.com', '8aElZF');
INSERT INTO USER (id, full_name, email, password) VALUES (10, 'Carr', 'ceginton9@mashable.com', 'H4TV7A');