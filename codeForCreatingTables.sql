use itacademy;

create table laptop (
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    brand VARCHAR(40) NOT NULL,
    model VARCHAR(40) NOT NULL,
    RAM INT DEFAULT 8,
    programmer_id INT NOT NULL
);

create table programmer (
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(40) NOT NULL, 
    program_language VARCHAR(40) NOT NULL,
    company VARCHAR(40) NOT NULL,
    age INT NOT NULL
);



ALTER TABLE laptop ADD FOREIGN KEY(programmer_id)
	REFERENCES programmer(id);
    
DROP TABLE laptop;
DROP TABLE programmer;