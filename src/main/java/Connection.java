import java.sql.*;

public class Connection {
    public Connection() throws SQLException {
        String url = "jdbc:mariadb://localhost:3306/gestion_de_note";
        String user = "octopus";
        String password = "testPass";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            java.sql.Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();

            // Create table client based on the client class
            statement.executeUpdate("CREATE TABLE IF NOT EXISTS client (id INT AUTO_INCREMENT PRIMARY KEY, nom VARCHAR(255), prenom VARCHAR(255), email VARCHAR(255), telephone VARCHAR(255), adresse VARCHAR(255))");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}
