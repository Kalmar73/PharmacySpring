Create Table Pharmacy
(
    Pharmacy_Number   varchar(20) Primary key,
    Name              varchar(60),
    Phone_Number      varchar(11),
    Address            varchar(120),
    Director_FullName varchar(60),
    Unique (Name, Phone_Number, Address)
);
Create Table Category
(
    Category_Code varchar(10) Primary Key,
    Category_Name varchar(60) Unique
);
Create Table Goods
(
    Goods_Code    varchar(20) Primary Key,
    Name          varchar(160),
    Category_Code varchar(10) References Category (Category_Code)
);
Create Table Available_Goods
(
    Pharmacy_Number varchar(20) References Pharmacy (Pharmacy_Number),
    Goods_Code      varchar(20) References Goods (Goods_Code),
    Price DECIMAL,
    Payment_Type    varchar(11),
    Primary Key (Pharmacy_Number, Goods_Code)
);
Create Table Characteristics
(
    Characteristics_Code varchar(20) Primary Key,
    Characteristics_Name varchar(20),
    Category_Code        varchar(10) References Category (Category_Code),
    Unique (Characteristics_Name)
);
Create Table Goods_Characteristics
(
    Characteristics_Code       varchar(20) References Characteristics (Characteristics_Code),
    Goods_Code                 varchar(20) References Goods (Goods_Code),
    Primary Key (Characteristics_Code, Goods_Code),
    Characteristics_Description varchar(120)
);