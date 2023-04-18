DROP TABLE IF EXISTS `caja`;
DROP table IF EXISTS `almacen`;


CREATE TABLE `almacen` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `lugar` varchar(100) DEFAULT NULL,
  `capacidad` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
);

CREATE TABLE `caja` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `contenido` varchar(250) DEFAULT NULL,
  `valor` int(11) DEFAULT NULL,
  `almacen` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `fk` FOREIGN KEY (`almacen`) REFERENCES `almacen` (`id`)
);