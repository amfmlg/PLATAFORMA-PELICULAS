Create database peliculas;
Use peliculas;

CREATE TABLE `usuario` (
  `id` int(11) NOT NULL,
  `usuario` varchar(255) NOT NULL,
  `correo` varchar(255) NOT NULL,
  `contraseña` varchar(255) NOT NULL,
  `fechaNacimiento` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;


CREATE TABLE `pelicula` (
  `id` int(11) NOT NULL,
  `titulo` varchar(255) NOT NULL,
  `director` varchar(255) NOT NULL,
  `reparto` varchar(255) NOT NULL,
  `genero` varchar(255) NOT NULL,
  `descripcion` varchar(255) NOT NULL,
  `fechaLanzamiento` date NOT NULL,
  `duracion` int(11) NOT NULL,
  `valoracion` float NOT NULL,
  `trailer` varchar(255) NOT NULL,
  `dondeVer` varchar(255) NOT NULL,
  `idioma` varchar(255) NOT NULL,
  `edadRecomendada` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

CREATE TABLE `comentarios` (
  `id` int(11) NOT NULL,
  `id_usuario` int(11) NOT NULL,
  `contenido` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
