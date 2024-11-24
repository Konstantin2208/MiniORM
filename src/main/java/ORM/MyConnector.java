package ORM;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class MyConnector {
    private static Connection connection;
    private static final String connectionString = "jdbc:mysql://localhost:3306/";

    public static void createConnection(String username, String password, String dbName) throws SQLException {


        connection= DriverManager.getConnection(connectionString+dbName,username,password);
    }
    public static Connection getConnection(){return connection;}
}
