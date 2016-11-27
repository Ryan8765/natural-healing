CREATE TABLE users
(
	id int NOT NULL AUTO_INCREMENT,
	first_name VARCHAR(255),
	last_name VARCHAR(255),
	license_number VARCHAR(255),
	email VARCHAR(255) NOT NULL UNIQUE,
	username VARCHAR(255),
	password VARCHAR(255),
	salt VARCHAR(255),
	verified_user BOOLEAN DEFAULT 0,
	active BOOLEAN DEFAULT 1,
	failed_attempts TINYINT(10),
	is_doctor BOOLEAN,
	date_created DATETIME,
	date_modified TIMESTAMP,

	PRIMARY KEY (id)

);


CREATE TABLE conditions (

	id INT NOT NULL AUTO_INCREMENT,
	name VARCHAR(255),
	description VARCHAR(10000),
	related_user INT,
	date_created DATETIME,
	date_modified TIMESTAMP,
	approved BOOLEAN DEFAULT 0,
	PRIMARY KEY (id),
	FOREIGN KEY (related_user) references users(id)

);

insert into Users (first_name, last_name, license_number, email, username, password, salt, verified_user, active, failed_attempts, is_doctor) values ('Ryan', 'Haas', '4534333', 'rmhaas221@gmail.com', 'rmhaas221', 'thisisapaswrod', '324234asdf;alkj', true, true, 3, true);


#create trigger for date created in the conditions table

CREATE TRIGGER conditions_creation_timestamp BEFORE INSERT ON conditions
FOR EACH ROW
SET NEW.date_created = NOW();


#create trigger for date created in the users table
CREATE TRIGGER users_creation_timestamp BEFORE INSERT ON users
FOR EACH ROW
SET NEW.date_created = NOW();
