DROP TABLE IF EXISTS `articulo`;
DROP table IF EXISTS `fabricante`;


CREATE TABLE `fabricante` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(250) DEFAULT NULL,
  PRIMARY KEY (`id`)
);

CREATE TABLE `articulo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(250) DEFAULT NULL,
  `precio` int(11) DEFAULT NULL,
  `fabricante` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `fab_fk` FOREIGN KEY (`fabricante`) REFERENCES `fabricante` (`id`)
);
