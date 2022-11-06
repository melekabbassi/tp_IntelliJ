package DAO;

import com.sdzee.tp.beans.Client;

import java.sql.Connection;
import java.sql.Statement;

/*
* Make a CLientDAO class extending the client class. It's going to be used to connect to the database using DBConnection class and make the CRUD operations.
*
* */

public class ClientDAO extends Client {

    public ClientDAO() {
    }

    public ClientDAO(int id_client, String nom, String prenom, String adresse, String telephone, String email) {
        super(id_client, nom, prenom, adresse, telephone, email);
    }

    public void addClient(Client client) {
        try {
            Connection connection = DBConnection.Connect();
            Statement statement = connection.createStatement();
            String sql = "INSERT INTO client (nom, prenom, adresse, telephone, email) VALUES ('" + client.getNom() + "', '" + client.getPrenom() + "', '" + client.getAdresse() + "', '" + client.getTelephone() + "', '" + client.getEmail() + "')";
            statement.executeUpdate(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteClient(Client client) {
        try {
            Connection connection = DBConnection.Connect();
            Statement statement = connection.createStatement();
            String sql = "DELETE FROM client WHERE id_client = " + client.getId_client();
            statement.executeUpdate(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateClient(Client client) {
        try {
            Connection connection = DBConnection.Connect();
            Statement statement = connection.createStatement();
            String sql = "UPDATE client SET nom = '" + client.getNom() + "', prenom = '" + client.getPrenom() + "', adresse = '" + client.getAdresse() + "', telephone = '" + client.getTelephone() + "', email = '" + client.getEmail() + "' WHERE id_client = " + client.getId_client();
            statement.executeUpdate(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


/*
public class ClientDAO extends Client {
    public ClientDAO(String nom, String prenom, String adresse, String telephone, String email) {
        super();
        this.setNom(nom);
        this.setPrenom(prenom);
        this.setAdresse(adresse);
        this.setTelephone(telephone);
        this.setEmail(email);
    }

    public void insertClient() {
        Connection connection = DBConnection.Connect();
        try {
            Statement statement = connection.createStatement();
            String query = "INSERT INTO client (nom, prenom, adresse, telephone, email) VALUES ('" + this.getNom() + "', '" + this.getPrenom() + "', '" + this.getAdresse() + "', '" + this.getTelephone() + "', '" + this.getEmail() + "')";
            statement.executeUpdate(query);
            System.out.println("Client inserted");
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

    public void updateClient() {
        Connection connection = DBConnection.Connect();
        try {
            Statement statement = connection.createStatement();
            String query = "UPDATE client SET nom = '" + this.getNom() + "', prenom = '" + this.getPrenom() + "', adresse = '" + this.getAdresse() + "', telephone = '" + this.getTelephone() + "', email = '" + this.getEmail() + "' WHERE telephone = " + this.getTelephone();
            statement.executeUpdate(query);
            System.out.println("Client updated");
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

    public void deleteClient() {
        Connection connection = DBConnection.Connect();
        try {
            Statement statement = connection.createStatement();
            String query = "DELETE FROM client WHERE telephone = " + this.getTelephone();
            statement.executeUpdate(query);
            System.out.println("Client deleted");
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

    public  void selectClient(){
        Connection connection = DBConnection.Connect();
        try {
            Statement statement = connection.createStatement();
            String query = "SELECT * FROM client WHERE telephone = " + this.getTelephone();
            statement.executeQuery(query);
            System.out.println("Client selected");
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

    public void selectAllClient() {
        Connection connection = DBConnection.Connect();
        try {
            Statement statement = connection.createStatement();
            String query = "SELECT * FROM client";
            statement.executeQuery(query);
            System.out.println("Client selected");
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
    public static void main(String[] args) {
        ClientDAO client1 = new ClientDAO( "Abbassi", "Melek", "49 rue souki belkhir", "56322519", "abbassimelek@gmail.com");
        ClientDAO client2 = new ClientDAO( "octopus", "eth1c", "50 rue souki belkhir", "23548050", "octopus@gmail.com");
        client1.deleteClient();
    }
}
*/