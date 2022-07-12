Create Table if not exists pharmacy
(
    id   INT Primary key AUTO_INCREMENT,
    name              varchar(60) NOT NULL,
    phone      varchar(11) NOT NULL,
    address            varchar(120) NOT NULL,
    fullname varchar(120) NOT NULL
);
Create Table if not exists Goods
(
    Id    INT Primary Key AUTO_INCREMENT,
    Name          varchar(160)
);
Create Table if not exists AvailableGoods
(
    Id INT PRIMARY KEY AUTO_INCREMENT,
    PharmacyId LONG References Pharmacy (Id),
    GoodsId      LONG References Goods (Id),
    Price DECIMAL NOT NULL ,
    Amount    LONG NOT NULL
);
Create Table if not exists Characteristic
(
    Id INT Primary Key AUTO_INCREMENT,
    Name varchar(20) NOT NULL
);
Create Table if not exists Goodscharacteristics
(
    Id INT PRIMARY KEY AUTO_INCREMENT,
    CharId       LONG References Characteristic (Id),
    GoodsId                 LONG References Goods (Id),
    Description varchar(300)
);
