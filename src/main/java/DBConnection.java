import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DBConnection {
    public static String url = "jdbc:mariadb://localhost:3306/gestion_de_note";
    public static String user = "octopus";
    public static String password = "testPass";

    public static String driver = "org.mariadb.jdbc.Driver";

    public static void Connect(){
        try{
            Class.forName(driver);
            Connection connection = DriverManager.getConnection(url, user, password);
            if (connection != null){
                System.out.println("Connected to the database");
            } else {
                System.out.println("Failed to make connection!");
            }
            Statement statement = connection.createStatement();
            statement.executeUpdate("CREATE TABLE IF NOT EXISTS client (id INT PRIMARY KEY AUTO_INCREMENT, nom VARCHAR(255), prenom VARCHAR(255), email VARCHAR(255), telephone VARCHAR(255), adresse VARCHAR(255))");
            System.out.println("Table client created");
        } catch (Exception e){
            System.out.println("Error: " + e);
        }
    }




    public static void main(String[] args) {
        Connect();
    }
}
