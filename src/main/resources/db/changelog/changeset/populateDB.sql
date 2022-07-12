--liquibase formatted sql

--changeset jaroslav:2
INSERT INTO Pharmacy (name, phone, address, fullname)
VALUES ('Vita', '89264532020', 'Lukashenko 25', 'Vasiliy Vasilievich');
INSERT INTO Pharmacy (name, phone, address, fullname)
VALUES ('Delta', '89274532020', 'Samarskaya 24', 'Ivan Ivanov');
INSERT INTO Pharmacy (name, phone, address, fullname)
VALUES ('Life', '89284532020', 'Moskovskaya 23', 'Daniil Daniilovich');

INSERT INTO Goods (Name)
VALUES ('Парацатамол');
INSERT INTO Goods (Name)
VALUES ('Визим');
INSERT INTO Goods (Name)
VALUES ('Смекта');
INSERT INTO Goods (Name)
VALUES ('Назал');

INSERT INTO characteristic (Name)
VALUES ('Спрей');
INSERT INTO characteristic (Name)
VALUES ('От насморка');
INSERT INTO characteristic (Name)
VALUES ('Для живота');
INSERT INTO characteristic (Name)
VALUES ('Обезболивающее');
INSERT INTO characteristic (Name)
VALUES ('Сильнодействующее');
INSERT INTO characteristic (Name)
VALUES ('Слабодействующее');

INSERT INTO Goodscharacteristics (goods_id, characteristic_id,  Description)
VALUES (1, 4, 'Слабодействующее обезболивающее');
INSERT INTO Goodscharacteristics (goods_id, characteristic_id,  Description)
VALUES (2, 4, 'Сильнодействующее обезболивающее');
INSERT INTO Goodscharacteristics (goods_id, characteristic_id,  Description)
VALUES (2, 6, 'Сильнодействующее обезболивающее');
INSERT INTO Goodscharacteristics (goods_id, characteristic_id,  Description)
VALUES (3, 3, 'Лекарство для живота');
INSERT INTO Goodscharacteristics (goods_id, characteristic_id,  Description)
VALUES (4, 2, 'Лекарство от насморка');
INSERT INTO Goodscharacteristics (goods_id, characteristic_id,  Description)
VALUES (4, 1, 'Лекарство от насморка');

INSERT INTO AvailableGoods (pharmacy_id, goods_id, Price, Amount)
VALUES (1, 1, 444, 20);
INSERT INTO AvailableGoods (pharmacy_id, goods_id, Price, Amount)
VALUES (1, 2, 234, 15);
INSERT INTO AvailableGoods (pharmacy_id, goods_id, Price, Amount)
VALUES (1, 3, 545, 23);
INSERT INTO AvailableGoods (pharmacy_id, goods_id, Price, Amount)
VALUES (2, 4, 234, 345);
INSERT INTO AvailableGoods (pharmacy_id, goods_id, Price, Amount)
VALUES (2, 2, 600, 435);
INSERT INTO AvailableGoods (pharmacy_id, goods_id, Price, Amount)
VALUES (3, 1, 444, 453);
INSERT INTO AvailableGoods (pharmacy_id, goods_id, Price, Amount)
VALUES (3, 3, 700, 700);