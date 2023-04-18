DROP TABLE IF EXISTS `empleado`;
DROP table IF EXISTS `departamento`;


CREATE TABLE `departamento` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(100) DEFAULT NULL,
  `presupuesto` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
);

CREATE TABLE `empleado` (
  `dni` varchar(8) NOT NULL,
  `nombre` varchar(100) DEFAULT NULL,
  `apellidos` varchar(255) DEFAULT NULL,
  `departamento` int(11) DEFAULT NULL,
  PRIMARY KEY (`dni`),
  CONSTRAINT `fk` FOREIGN KEY (`departamento`) REFERENCES `departamento` (`id`)
);

/*
insert into departamento(nombre,presupuesto) vaules('Ventas', 1234);
insert into empleado(dni,nombre,apellidos,departamento) vaules('12345A','Joan','Lapeyra',1);
*/