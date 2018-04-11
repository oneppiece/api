CREATE DATABASE angular;

USE angular;

CREATE TABLE products (
  id           INT AUTO_INCREMENT NOT NULL,
  product_name VARCHAR(20),
  PRIMARY KEY (id)
)
  ENGINE = InnoDB
  DEFAULT CHARSET = utf8
  AUTO_INCREMENT = 2;