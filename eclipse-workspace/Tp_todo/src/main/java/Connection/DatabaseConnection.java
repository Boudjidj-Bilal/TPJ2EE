package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String URL = "jdbc:postgresql://localhost:5432/MasterAnnonce";
    private static final String USER = "admin";
    private static final String PASSWORD = "secret";

    private static Connection connect;

    // Constructor is private to prevent instantiation
    private DatabaseConnection()throws ClassNotFoundException{
        try{
            Class.forName("org.postgresql.Driver");
            connect = DriverManager.getConnection(URL,USER,PASSWORD);
        }catch(SQLException e){
            e.printStackTrace();
            // throw e;
        }
    }

    // Get the database connection
    public static Connection getInstance()throws ClassNotFoundException{
        if(connect == null) {
                new DatabaseConnection();
        }
        return connect;
    }

    // Close the connection
    public static void close() throws SQLException {
        if (connect != null && !connect.isClosed()) {
            connect.close();
        }
    }
}
