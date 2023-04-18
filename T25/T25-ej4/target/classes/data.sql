DROP TABLE IF EXISTS `sala`;
DROP TABLE IF EXISTS `pelicula`;


CREATE TABLE `pelicula` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(250) DEFAULT NULL,
  `calificacion_edad` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
);

CREATE TABLE `sala` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(250) DEFAULT NULL,
  `pelicula` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `fk` FOREIGN KEY (`pelicula`) REFERENCES `pelicula` (`id`)
);
