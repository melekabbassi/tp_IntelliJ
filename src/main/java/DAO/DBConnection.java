package DAO;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    private static final String url = "jdbc:mariadb://localhost:3306/gestion_de_commande";
    private static final String user = "octopus";
    private static final String  password = "testPass";
    public static String driver = "org.mariadb.jdbc.Driver";

    public static Connection Connect(){
        try{
            Class.forName(driver);
            Connection connection = DriverManager.getConnection(url, user, password);
            if (connection != null){
                System.out.println("Connected to the database");
            } else {
                System.out.println("Failed to make connection!");
            }
            return connection;
        } catch (Exception e){
            System.out.println("Error: " + e);
        }
        return null;
    }

    public static void main(String[] args) {
        Connect();
    }
}
