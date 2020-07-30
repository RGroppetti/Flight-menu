CREATE database menu;
USE menu;
CREATE TABLE `menu`.`items` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `calories` INT NOT NULL,
  `name` VARCHAR(45) NOT NULL,
  `price` DECIMAL(4,2) NOT NULL,
  PRIMARY KEY (`id`));
insert into items (calories,name,price) values (1000,"Steak",20.00);
insert into items (calories,name,price) values (250,"Salad",7.50);
insert into items (calories,name,price) values (450,"Club Sandwich",8.25);
insert into items (calories,name,price) values (100,"Soda",3.00);
insert into items (calories,name,price) values (450,"Brownie",6.00);
insert into items (calories,name,price) values (200,"Cookie",3.00);
insert into items (calories,name,price) values (150,"Wine",10.00);
insert into items (calories,name,price) values (425,"Ramen",1.00);
insert into items (calories,name,price) values (650,"McChicken",3.00);