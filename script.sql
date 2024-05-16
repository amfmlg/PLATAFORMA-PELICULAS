Create database pelis;
Use pelis;

CREATE TABLE IF NOT EXISTS usuario (
    idUsuario INT primary key not null,
    usuario VARCHAR(255),
    contraseña varchar(255),
    correo varchar(255)
);

CREATE TABLE IF NOT EXISTS pelicula(
	idPelicula INT primary key not null,
    titulo varchar (255),
    director varchar (255),
    reparto varchar (255),
    genero varchar(255),
    descripcion varchar(255),
    añoLanzamiento INT,
    duracion date,
    valoracion float
);