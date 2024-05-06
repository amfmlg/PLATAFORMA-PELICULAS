import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/conectarjava";
        String user = "root";
        String password = "aula7";
        try{
            Connection connection = DriverManager.getConnection(url, user, password);
            
        } catch(SQLException ex){
            ex.printStackTrace(System.out);
        }    
       

    }
}