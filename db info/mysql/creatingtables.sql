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
	date_created DATE,

	PRIMARY KEY (id)

);


create table conditions (

	id int NOT NULL AUTO_INCREMENT,
	name varchar(255),
	description varchar,
	related_user int,
	date_created DATE,
	approved BOOLEAN,
	primary key (id),
	FOREIGN KEY (related_user) references users(id)

);

insert into Users (first_name, last_name, license_number, email, username, password, salt, verified_user, active, failed_attempts, is_doctor, date_created) values ('Ryan', 'Haas', '4534333', 'rmhaas221@gmail.com', 'rmhaas221', 'thisisapaswrod', '324234asdf;alkj', true, true, 3, true, '2012-01-01');
