DROP DATABASE IF EXISTS sseitturner;

CREATE DATABASE IF NOT EXISTS sseitturner;

USE sseitturner;

CREATE TABLE IF NOT EXISTS entries
(
  id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
  os VARCHAR(50) NOT NULL,
  osVersion VARCHAR(50) NOT NULL,
  notes VARCHAR(250) NOT NULL,
  timestamp TIMESTAMP DEFAULT now() NOT NULL
);
