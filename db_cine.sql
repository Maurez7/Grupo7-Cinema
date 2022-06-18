/**
 * Author:  Santiago Coronado
 * Created: 18 jun. 2022
 */

CREATE DATABASE cine;
USE cine;
CREATE TABLE carteleras(
    id_cartelera    INT(255) AUTO_INCREMENT PRIMARY KEY NOT NULL,
    num_cartelera   INT(10) NOT NULL
)ENGINE=InnoDB;

CREATE TABLE tipo_peliculas(
    id_tipo_pelicula    INT(255) AUTO_INCREMENT PRIMARY KEY NOT NULL,
    tipo_pelicula       VARCHAR(50) NOT NULL
)ENGINE=InnoDB;

CREATE TABLE horario_peliculas(
    id_horario_pelicula        INT(255) AUTO_INCREMENT PRIMARY KEY NOT NULL,
    horario_pelicula    INT(100) NOT NULL
)ENGINE=InnoDB;

CREATE TABLE salas(
    id_sala                 INT(255) AUTO_INCREMENT PRIMARY KEY NOT NULL,
    num_sala                INT(10) NOT NULL,
    cantidad_asientos_sala  INT(100) NOT NULL
)ENGINE=InnoDB;

CREATE TABLE comidas(
    id_comida       INT(255) AUTO_INCREMENT PRIMARY KEY NOT NULL,
    nombre_comida   VARCHAR(100) NOT NULL
)ENGINE=InnoDB;

CREATE TABLE bebidas(
    id_bebida       INT(255) AUTO_INCREMENT PRIMARY KEY NOT NULL,
    nombre_bebida   VARCHAR(100) NOT NULL
)ENGINE=InnoDB;

CREATE TABLE asientos(
    id_asiento      INT(255) AUTO_INCREMENT PRIMARY KEY NOT NULL,
    ubi_asiento     INT(255) NOT NULL,
    id_sala_asiento INT(255) NOT NULL,
    CONSTRAINT fk_sala_asiento FOREIGN KEY(id_sala_asiento) REFERENCES salas(id_sala)
)ENGINE=InnoDB;

CREATE TABLE peliculas(
    id_pelicula             INT(255) AUTO_INCREMENT PRIMARY KEY NOT NULL,
    nombre_pelicula         VARCHAR(100) NOT NULL,
    descripcion_pelicula    VARCHAR(255),
    fecha_pelicula          DATE NOT NULL,
    precio_pelicula         INT(255) NOT NULL,
    id_tipo_pelicula        INT(255) NOT NULL,
    id_horario_pelicula     INT(255) NOT NULL,
    id_cartelera_pelicula   INT(255) NOT NULL,
    id_sala_pelicula        INT(255) NOT NULL,
    CONSTRAINT fk_tipo_pelicula FOREIGN KEY(id_tipo_pelicula) REFERENCES tipo_peliculas(id_tipo_pelicula),
    CONSTRAINT fk_horario_pelicula FOREIGN KEY(id_horario_pelicula) REFERENCES horario_peliculas(id_horario_pelicula),
    CONSTRAINT fk_cartelera_pelicula FOREIGN KEY(id_cartelera_pelicula) REFERENCES carteleras(id_cartelera),
    CONSTRAINT fk_sala_pelicula FOREIGN KEY(id_sala_pelicula) REFERENCES salas(id_sala)
)ENGINE=InnoDB;

CREATE TABLE tickets(
    id_ticket           INT(255) AUTO_INCREMENT PRIMARY KEY NOT NULL,
    id_sala_ticket      INT(255) NOT NULL,
    id_pelicula_ticket  INT(255) NOT NULL,
    id_asiento_ticket   INT(255) NOT NULL,
    id_comida_ticket    INT(255) NOT NULL,
    id_bebida_ticket    INT(255) NOT NULL,
    CONSTRAINT fk_pelicula_ticket FOREIGN KEY(id_pelicula_ticket) REFERENCES peliculas(id_pelicula),
    CONSTRAINT fk_asiento_ticket FOREIGN KEY(id_asiento_ticket) REFERENCES asientos(id_asiento),    
    CONSTRAINT fk_comida_ticket FOREIGN KEY(id_comida_ticket) REFERENCES comidas(id_comida),
    CONSTRAINT fk_bebida_ticket FOREIGN KEY(id_bebida_ticket) REFERENCES bebidas(id_bebida)
)ENGINE=InnoDB;
