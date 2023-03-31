USE actividades;

-- 1.1
SELECT nombre FROM articulos;

-- 1.2
SELECT nombre, precio FROM articulos;

-- 1.3
SELECT nombre FROM articulos WHERE precio <= 200;

-- 1.4
SELECT * FROM articulos WHERE precio BETWEEN 60 AND 120;

-- 1.5
SELECT nombre, precio*166.386 AS "precio(pesestas)" FROM articulos;

-- 1.6
SELECT AVG(precio) FROM articulos;

-- 1.7
SELECT AVG(precio) FROM articulos WHERE fabricante = 2;

-- 1.8 
SELECT COUNT(*) AS "Nº artículos" FROM articulos WHERE precio >= 180;

-- 1.9
SELECT nombre, precio  FROM articulos WHERE precio >= 180
ORDER BY precio DESC, nombre ASC;

-- 1.10
SELECT articulos.*, fabricantes.* FROM articulos 
INNER JOIN fabricantes ON articulos.fabricante = fabricantes.codigo;

-- 1.11
SELECT articulos.nombre, articulos.precio, fabricantes.nombre FROM articulos
INNER JOIN fabricantes ON articulos.fabricante = fabricantes.codigo;

-- 1.12
SELECT AVG(precio) AS "Precio medio", fabricante
FROM articulos
GROUP BY articulos.fabricante;

-- 1.13
SELECT AVG(articulos.precio) AS "Precio medio", fabricantes.nombre AS "Nombre Fabricante"
FROM articulos
INNER JOIN fabricantes ON articulos.fabricante = fabricantes.codigo
GROUP BY articulos.fabricante;

-- 1.14
SELECT fabricantes.nombre AS "Nombre fabricante" FROM fabricantes
INNER JOIN articulos ON articulos.fabricante = fabricantes.codigo
GROUP BY articulos.fabricante
HAVING AVG(articulos.precio) >= 150;

-- 1.15
SELECT nombre, precio FROM articulos
ORDER BY precio LIMIT 1;

-- 1.16
SELECT articulos.nombre AS articulo, articulos.precio, fabricantes.nombre AS fabricante
FROM articulos
INNER JOIN fabricantes ON articulos.fabricante = fabricantes.codigo
WHERE articulos.precio = (SELECT MAX(precio) FROM articulos AS a WHERE a.fabricante = articulos.fabricante);

-- 1.17
INSERT INTO articulos (codigo, nombre, precio, fabricante) VALUES
(11, "Altavoces", 70, 2);

-- 1.18
UPDATE articulos
SET nombre = "Impresora Laser"
WHERE codigo = 8;

SET SQL_SAFE_UPDATES = 0;
-- 1.19
UPDATE articulos
SET precio = precio*0.9;

-- 1.20
UPDATE articulos
SET precio = precio-10
WHERE precio >= 120;