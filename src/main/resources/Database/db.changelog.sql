-- liquibase formatted sql

-- changeset Jaroslav:1
Create Table if not exists Pharmacy
(
    Id   LONG Primary key AUTO_INCREMENT,
    Name              varchar(60) NOT NULL,
    Phone_Number      varchar(11) NOT NULL,
    Address            varchar(120) NOT NULL,
    DirectorFullName varchar(120) NOT NULL
);
Create Table if not exists Goods
(
    Id    LONG Primary Key AUTO_INCREMENT,
    Name          varchar(160)
);
Create Table if not exists AvailableGoods
(
    Id LONG PRIMARY KEY AUTO_INCREMENT,
    PharmacyId LONG References Pharmacy (Id),
    GoodsId      LONG References Goods (Id),
    Price DECIMAL NOT NULL ,
    Amount    LONG NOT NULL
);
Create Table if not exists Characteristic
(
    Id LONG Primary Key,
    Name varchar(20) NOT NULL
);
Create Table if not exists GoodsCharacteristics
(
    Id LONG PRIMARY KEY ,
    CharId       LONG References Characteristic (Id),
    GoodsId                 LONG References Goods (Id),
    Description varchar(300)
);