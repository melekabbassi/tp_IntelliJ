import java.sql.*;

public class Connection {
    public Connection() throws SQLException {
String url = "jdbc:mariadb://localhost:3306/gestion_de_note";
        String user = "octopus";
        String password = "Benalidegage_23";

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        java.sql.Connection connection = DriverManager.getConnection(url, user, password);
        Statement statement = connection.createStatement();
    }
}
