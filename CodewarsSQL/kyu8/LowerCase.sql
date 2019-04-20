SELECT id, name, birthday, LOWER(race) AS race
  FROM demographics;

//

DROP DATABASE LowerCase;

CREATE DATABASE LowerCase;

USE LowerCase;

CREATE TABLE demographics(
	id       INT         PRIMARY KEY AUTO_INCREMENT,
	name     VARCHAR(20) NOT NULL,
	birthday DATE        NOT NULL,
	race     VARCHAR(20) NOT NULL
);

INSERT INTO `demographics`(`name`,`birthday`,`race` ) VALUES("Terrill","1966-02-22","white");
INSERT INTO `demographics`(`name`,`birthday`,`race` ) VALUES("Adolphus","1990-02-25","AmeriCAN indiaN");
INSERT INTO `demographics`(`name`,`birthday`,`race` ) VALUES("Giovanny","1981-12-12","BLACK or AFRICAN");
INSERT INTO `demographics`(`name`,`birthday`,`race` ) VALUES("Rosanna","1982-02-25","ASIAN");
INSERT INTO `demographics`(`name`,`birthday`,`race` ) VALUES("Josiah","1997-03-26","WHITE");


/* https://stackoverflow.com/questions/754527/best-way-to-test-sql-queries */
SELECT CONCAT(
		'5 registros ',
		case when (SELECT COUNT(*) FROM demographics)
			= 5 
			THEN 'test ok'
			ELSE 'failure' 
		END
		) as "Test conteo total";