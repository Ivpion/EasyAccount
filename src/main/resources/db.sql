CREATE TABLE Supplier (
ID INT NOT NULL AUTO_INCREMENT,
name VARCHAR(20) NOT NULL,
city VARCHAR(20) not null,
discount int,
PRIMARY KEY (ID)
);



CREATE TABLE Goods (
ID INT NOT NULL AUTO_INCREMENT,
name VARCHAR(100) NOT NULL,


CREATE TABLE IF NOT EXISTS `EasyAccount`.`Goods` (
  `id` INT(11) NOT NULL COMMENT '',
  `goods_name` VARCHAR(255) NOT NULL COMMENT '',
  `category_id` INT(11) NOT NULL COMMENT '',
  `Goods_category_id` INT(11) NOT NULL COMMENT '',
  PRIMARY KEY (`id`, `Goods_category_id`)  COMMENT '',
  INDEX `fk_Goods_Goods_category_idx` (`Goods_category_id` ASC)  COMMENT '')
ENGINE = MyISAM
DEFAULT CHARACTER SET = hp8
)

