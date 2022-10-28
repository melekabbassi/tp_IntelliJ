package DAO;

import com.sdzee.tp.beans.Client;

import java.sql.Connection;
import java.sql.Statement;

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
        ClientDAO client = new ClientDAO( "Abbassi", "Melek", "49 rue souki belkhir", "56322519", "abbassimelek@gmail.com");
        client.insertClient();
    }
}
