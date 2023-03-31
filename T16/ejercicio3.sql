USE actividades;

-- 3.1
SELECT * FROM almacenes;

-- 3.2
SELECT * FROM cajas WHERE valor > 150;

-- 3.3
SELECT DISTINCT contenido FROM cajas;

-- 3.4
SELECT AVG(valor) as "Valor medio" FROM cajas;

-- 3.5
SELECT AVG(valor) as "Valor medio", almacen FROM cajas GROUP BY almacen;

-- 3.6
SELECT almacen FROM cajas
GROUP BY almacen HAVING AVG(valor) > 150;

-- 3.7
SELECT cajas.numreferencia, almacenes.lugar 
FROM cajas INNER JOIN almacenes ON cajas.almacen = almacenes.codigo;

-- 3.8
SELECT COUNT(*) AS "Nº cajas", almacen FROM cajas
GROUP BY almacen;

-- 3.9
SELECT cajas.almacen, almacenes.capacidad
FROM cajas INNER JOIN almacenes ON cajas.almacen = almacenes.codigo
GROUP BY almacenes.codigo
HAVING almacenes.capacidad < COUNT(*);

-- 3.10
SELECT cajas.numreferencia
FROM cajas INNER JOIN almacenes ON cajas.almacen = almacenes.codigo
WHERE almacenes.lugar = "Bilbao";

-- 3.11
INSERT INTO almacenes(codigo, lugar, capacidad) VALUES
(6, "Barcelona", 3);

-- 3.12
INSERT INTO cajas(numreferencia, contenido, valor, almacen) VALUES
("H5RT", "Papel", 200, 2);

-- 3.13
UPDATE cajas SET valor = valor*0.85;

-- 3.14
UPDATE cajas SET valor = valor*0.8
WHERE valor > (SELECT AVG(c.valor) FROM cajas AS c);

-- 3.15
DELETE FROM cajas WHERE valor < 100;

-- 3.16
DELETE FROM cajas WHERE almacen IN (
	SELECT cajas.almacen
	FROM cajas INNER JOIN almacenes ON cajas.almacen = almacenes.codigo
	GROUP BY almacenes.codigo
	HAVING almacenes.capacidad < COUNT(*)
);