package KONEKSI;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Koneksi_login {
    public static Connection getConnection() throws ClassNotFoundException {
        String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
        Connection conn = null;
        String url = "jdbc:mysql://localhost/db_sunbook"; //url database
        String user="root"; //user database
        String pass=""; //password
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(url, user, pass);
        } catch (SQLException e) {
            System.out.println(e);
        }
        return conn;
    }
    public static void main(String[] args) throws ClassNotFoundException {
        try {
            Connection c = Koneksi_login.getConnection();
            System.out.println(String.format("Connected to Database %s" + "Successfully.", c.getCatalog()));
        } catch (SQLException e){
            System.out.println(e);
        }
    }
}
