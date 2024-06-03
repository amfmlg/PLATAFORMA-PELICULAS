package com.pelicula.pelicula.java.com.pelicula.conexion;

public import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/peli-culones";
    private static final String USER = "root";
    private static final String PASSWORD = "Aula7";

    public static void main(String[] args) {
        try {
            // Establecer conexión
            Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
            
            // Ejecutar consultas y operaciones en la base de datos
            
            // Cerrar la conexión
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
} 
