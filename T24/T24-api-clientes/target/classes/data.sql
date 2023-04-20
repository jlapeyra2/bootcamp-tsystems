DROP TABLE IF EXISTS empleado;


CREATE TABLE empleado (
	id int(11) NOT NULL AUTO_INCREMENT PRIMARY KEY,
	nombre varchar(250) DEFAULT NULL,
	categoria varchar(250) DEFAULT NULL,
	salario decimal(11,2) DEFAULT NULL
);

insert into empleado(nombre,categoria,salario) values('Joan','informatico',2000.0);
