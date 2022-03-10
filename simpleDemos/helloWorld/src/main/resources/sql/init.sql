CREATE TABLE `myBatisDatabase`.`t_user`
(
    `id`       INT NOT NULL AUTO_INCREMENT,
    `username` VARCHAR(20),
    `password` VARCHAR(20),
    `age`      INT,
    `sex`      CHAR,
    `email`    VARCHAR(20),
    PRIMARY KEY (`id`)
);