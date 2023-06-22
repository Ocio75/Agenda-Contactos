-- Creación de la base de datos
CREATE DATABASE IF NOT EXISTS `bd_agendatelefonica`;

-- Uso de la base de datos
USE `bd_agendatelefonica`;

-- Eliminación de tablas existentes
DROP TABLE IF EXISTS `contactos`;
DROP TABLE IF EXISTS `tipocontacto`;

-- Creación de la tabla 'contactos'
CREATE TABLE IF NOT EXISTS `contactos` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(100) NOT NULL,
  `apellidos` varchar(100) NOT NULL,
  `telefono` varchar(15) NOT NULL,
  `correo` varchar(100) DEFAULT NULL,
  `direccion` varchar(200) DEFAULT NULL,
  `genero` varchar(10) DEFAULT NULL,
  `fecha_nacimiento` date DEFAULT NULL,
  `notas` text,
  `idTipocon` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `idTipocon` (`idTipocon`)
) ENGINE=MyISAM AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Creación de la tabla 'tipocontacto'
CREATE TABLE IF NOT EXISTS `tipocontacto` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Inserción de datos de ejemplo en la tabla 'tipocontacto'
INSERT INTO `tipocontacto` (`id`, `nombre`) VALUES
(1, 'Sin etiquetar'),
(2, 'Familia'),
(3, 'Trabajo');

-- Creación del usuario y asignación de permisos
CREATE USER 'ConexionAgenda'@'%' IDENTIFIED WITH caching_sha2_password BY '***';
GRANT SELECT, INSERT, UPDATE, DELETE, CREATE, DROP, FILE, INDEX, ALTER, CREATE TEMPORARY TABLES, CREATE VIEW, EVENT, TRIGGER, SHOW VIEW, CREATE ROUTINE, ALTER ROUTINE, EXECUTE ON `bd_agendatelefonica`.* TO 'ConexionAgenda'@'%';
ALTER USER 'ConexionAgenda'@'%' REQUIRE NONE WITH MAX_QUERIES_PER_HOUR 0 MAX_CONNECTIONS_PER_HOUR 0 MAX_UPDATES_PER_HOUR 0 MAX_USER_CONNECTIONS 0;
GRANT ALL PRIVILEGES ON `bd_agendatelefonica`.* TO 'ConexionAgenda'@'%';

-- Fin del script SQL
