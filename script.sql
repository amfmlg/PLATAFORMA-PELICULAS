Create database pelis;
Use pelis;

CREATE TABLE IF NOT EXISTS usuario (
    idUsuario INT primary key not null,
    usuario VARCHAR(255),
    contraseña varchar(255),
    correo varchar(255)
);

