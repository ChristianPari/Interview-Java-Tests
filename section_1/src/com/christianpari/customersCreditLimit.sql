CREATE TABLE customers (
  id INTEGER PRIMARY KEY,
  name CHAR(255) NOT NULL,
  country CHAR(255) NOT NULL,
  credits INTEGER NOT NULL
);

INSERT INTO customers (name, country, credits) VALUES ("Frances White", "USA", 200350);
INSERT INTO customers (name, country, credits) VALUES ("Carolyn Bradley", "UK", 15354);
INSERT INTO customers (name, country, credits) VALUES ("Annie Fernandez", "France", 359200);
INSERT INTO customers (name, country, credits) VALUES ("Ruth Hanson", "Albania", 1060);
INSERT INTO customers (name, country, credits) VALUES ("Paula Fuller", "USA", 14789);
INSERT INTO customers (name, country, credits) VALUES ("Bonnie Johnston", "China", 1000243);
INSERT INTO customers (name, country, credits) VALUES ("Ruth Gutierrez", "USA", 998999);
INSERT INTO customers (name, country, credits) VALUES ("Ernest Thomas", "Canada", 500500);
INSERT INTO customers (name, country, credits) VALUES ("Joe Garza", "UK", 18782);
INSERT INTO customers (name, country, credits) VALUES ("Anne Harris", "USA", 158367);

SELECT customers.id, customers.name FROM customers
WHERE customers.country = "USA" AND customers.credits > 100000
ORDER BY customers.id;