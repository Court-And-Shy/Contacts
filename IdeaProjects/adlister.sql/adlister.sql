CREATE DATABASE IF NOT EXISTS practice_ad_db;

USE practice_ad_db;

DROP TABLE users;

CREATE TABLE users
(
    id       INT UNSIGNED NOT NULL AUTO_INCREMENT,
    email    VARCHAR(250) NOT NULL,
    password VARCHAR(200) NOT NULL,
    PRIMARY KEY (id)
);

# We will be hashing our passwords

INSERT INTO users(email, password)
VALUES ('bill@gmail.com', 'bill123'),
       ('jamie@yahoo.com', 'jame23'),
       ('tom@hotmail.com', 'tom999'),
       ('jessie@gmail.com', 'jessie00');

DROP TABLE ads;

CREATE TABLE ads
(
    id          INT UNSIGNED     NOT NULL AUTO_INCREMENT,
    title       VARCHAR(75),
    description TEXT,
    user_id     INTEGER UNSIGNED NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (user_id) REFERENCES users (id)
);

INSERT INTO ads(id, title, description, user_id)
VALUES (1, 'iPhone', 'New phone ready for you', 1),
       (2, 'Tablet', 'Tablet that is slightly used for you', 2),
       (3, 'Chair', 'Brand new chair that is ready for you', 3),
       (4, 'Book', 'Nice book for you that is nice to read', 4);

DROP TABLE category;

CREATE TABLE category
(
    id   INT UNSIGNED NOT NULL,
    name VARCHAR(150),
    PRIMARY KEY (id)
);

INSERT INTO category(id, name)
VALUES (1, 'Used'),
       (2, 'New'),
       (3, 'Tech'),
       (4, 'Furniture');


DROP TABLE category_ad;

CREATE TABLE category_ad
(
    category_id INT UNSIGNED NOT NULL,
    ads_id      INT UNSIGNED NOT NULL,
    FOREIGN KEY (category_id) REFERENCES category (id),
    FOREIGN KEY (ads_id) REFERENCES ads (id)
);

INSERT INTO category_ad(category_id, ads_id)
VALUES ('', ''),
       ('', ''),
       ('', '');
