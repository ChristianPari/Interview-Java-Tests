-- SQLite
CREATE TABLE superhero (
  id INTEGER PRIMARY KEY,
  name CHAR(100),
  latitude FLOAT,
  longitude FLOAT
);

INSERT INTO superhero VALUES (1, "Batman", 50.0, 85.0);
INSERT INTO superhero VALUES (2, "Spiderman", 65.0, 65.0);
INSERT INTO superhero VALUES (3, "Thor", 45.0, 30.0);
INSERT INTO superhero VALUES (4, "Deadpool", 25.0, 69.0);
INSERT INTO superhero VALUES (5, "Hulk", 30.0, 20.0);
INSERT INTO superhero VALUES (6, "Captian America", 70.0, 75.0);
INSERT INTO superhero VALUES (7, "Superman", 85.0, 45.0);

SELECT superhero.name FROM superhero
WHERE LENGTH(superhero.name) <= 7
ORDER BY ID;