CREATE DATABASE  IF NOT EXISTS Film;

USE Film;

DROP TABLE IF EXISTS film;


CREATE TABLE film (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `Name` varchar(45) DEFAULT NULL,
  `Year` int(5) DEFAULT NULL,
  `Country` varchar(45) DEFAULT NULL,
  `Genres` varchar(45) DEFAULT NULL,
  `Director` varchar(45) DEFAULT NULL,
  `Score` int DEFAULT 1,
  `Viewed` boolean DEFAULT false,
  PRIMARY KEY (`id`)
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4;

LOCK TABLES film WRITE;


INSERT INTO film (Name, Year, Country, Genres, Director, Score, Viewed) VALUES 
	('Forrest Gump','1994','USA','Drama','Robert Zemeckis','90',true),
	(N'Tenkrát na Západě','1968','USA','Western','Sergio Leone','85',true),
	('Matrix','1999','USA',N'Akční','Andy Wachowski','90',true),
	('Rain Man','1988','USA','Drama','Barry Levinson','90',true),
	(N'Vetřelec','1979','USA','Sci-Fi','Ridley Scott','80',true),
	(N'L. A. - Přísně tajné','1994','USA','Drama','Curtis Hanson','75',true),
	(N'Návrat do budoucnosti','1985','USA','Komedie','Robert Zemeckis','95',true),
	(N'Nespoutaný Django','2012','USA','Western','Quentin Tarantino','65',true),
	(N'Prázdniny v Římě','1953','USA',N'Romantický','William Wyler','0',false),
	('Gentlemani','2019','USA',N'Akční','Guy Ritchie','0',false),
	('Sbal prachy a vypadni','1998','UK','Komedie','Guy Ritchie','85',true),
	('Joker','2019','USA','Drama','Todd Phillips','0',false),
	('Avengers: Endgame','2019','USA',N'Akční','Anthony Russo','60',true),
	('Avengers: Infinity War','2018','USA',N'Akční','Anthony Russo','65',true),
	(N'Pelíšky','1999','CZ','Komedie',N'Jan Hřebejk','100',true),
	(N'Musíme si pomáhat','2000','CZ','Komedie',N'Jan Hřebejk','80',true),
	('Kolja','1996','CZ','Komedie',N'Jan Svěrák','85',true),
	(N'Tmavomodrý svět','2001','CZ','Drama',N'Jan Svěrák','90',true),
	(N'Šarlatán','2020','CZ','Drama','Agnieszka Holland','0',false),
	(N'Vlastníci','2019','CZ','Komedie',N'Jiří Havelka','0',false),
	(N'Spider-Man: Paralelní světy','2018','USA',N'Animovaný','Bob Persichetti','0',false),
	('Apollo 11','2019','USA',N'Dokumentární','Todd Douglas Miller','0',false),
	('Deadpool 2','2018','USA',N'Akční','David Leitch','0',false),
	('Mission: Impossible - Fallout','2018','USA',N'Akční','Christopher McQuarrie','0',false),
	(N'Tenkrát v Hollywoodu','2019','USA','Komedie','Quentin Tarantino','0',false),
	('Vlk z Wall Street','2013','USA','Komedie','Martin Scorsese','75',true);


