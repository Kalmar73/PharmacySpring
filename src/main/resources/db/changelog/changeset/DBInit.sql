
Create Table if not exists pharmacy
(
    Id   INT Primary key AUTO_INCREMENT,
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
    pharmacy_id INT,
    goods_id      INT,
    Price DECIMAL NOT NULL ,
    Amount    LONG NOT NULL,
    FOREIGN KEY (pharmacy_id) references pharmacy(Id),
    FOREIGN KEY (goods_id) references Goods(Id)
);
Create Table if not exists Characteristic
(
    Id INT Primary Key AUTO_INCREMENT,
    Name varchar(20) NOT NULL
);
Create Table if not exists Goodscharacteristics
(
    Id INT PRIMARY KEY AUTO_INCREMENT,
    characteristic_id       INT References Characteristic (Id),
    goods_id                 INT References Goods (Id),
    Description varchar(300),
    FOREIGN KEY (characteristic_id) references Characteristic(Id),
    FOREIGN KEY (goods_id) references Goods(Id)
);