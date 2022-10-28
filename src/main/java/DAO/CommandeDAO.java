package DAO;

import com.sdzee.tp.beans.Commande;

import java.sql.Connection;
import java.sql.Statement;

public class CommandeDAO extends Commande {
    public CommandeDAO(ClientDAO client, String date, Double montant, String modePaiement, String statutPaiement, String modeLivraison, String statutLivraison) {
        super();
        this.setClient(client);
        this.setDate(date);
        this.setMontant(montant);
        this.setModePaiement(modePaiement);
        this.setStatutPaiement(statutPaiement);
        this.setModeLivraison(modeLivraison);
        this.setStatutLivraison(statutLivraison);
    }

    // crud
    public void insertCommande() {
        Connection connection = DBConnection.Connect();
        // create commande in database with client id and commande properties using foreign key
        try {
            Statement statement = connection.createStatement();
            String sql = "INSERT INTO commande (id_client, date, montant, mode_paiement, statut_Paiement, mode_Livraison, statut_Livraison) VALUES (" + this.getClient().getId_client() + ", '" + this.getDate() + "', " + this.getMontant() + ", '" + this.getModePaiement() + "', '" + this.getStatutPaiement() + "', '" + this.getModeLivraison() + "', '" + this.getStatutLivraison() + "')";
            statement.executeUpdate(sql);
            System.out.println("Commande inserted");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateCommande() {
        Connection connection = DBConnection.Connect();
        // update commande in database with client id and commande properties using foreign key
        try {
            Statement statement = connection.createStatement();
            String sql = "UPDATE commande SET date = '" + this.getDate() + "', montant = " + this.getMontant() + ", mode_paiement = '" + this.getModePaiement() + "', statut_Paiement = '" + this.getStatutPaiement() + "', mode_Livraison = '" + this.getModeLivraison() + "', statut_Livraison = '" + this.getStatutLivraison() + "' WHERE id_commande = " + this.getId_commande();
            statement.executeUpdate(sql);
            System.out.println("Commande updated");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteCommande() {
        Connection connection = DBConnection.Connect();
        // delete commande in database with client id and commande properties using foreign key
        try {
            Statement statement = connection.createStatement();
            String sql = "DELETE FROM commande WHERE id_commande = " + this.getId_commande();
            statement.executeUpdate(sql);
            System.out.println("Commande deleted");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectCommande() {
        Connection connection = DBConnection.Connect();
        // select commande in database with client id and commande properties using foreign key
        try {
            Statement statement = connection.createStatement();
            String sql = "SELECT * FROM commande WHERE id_commande = " + this.getId_commande();
            statement.executeQuery(sql);
            System.out.println("Commande selected");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectAllCommande() {
        Connection connection = DBConnection.Connect();
        // select all commande in database with client id and commande properties using foreign key
        try {
            Statement statement = connection.createStatement();
            String sql = "SELECT * FROM commande";
            statement.executeQuery(sql);
            System.out.println("All commande selected");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectCommandeByClient() {
        Connection connection = DBConnection.Connect();
        // select commande in database with client id and commande properties using foreign key
        try {
            Statement statement = connection.createStatement();
            String sql = "SELECT * FROM commande WHERE id_client = " + this.getClient().getId_client();
            statement.executeQuery(sql);
            System.out.println("Commande selected");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectAllCommandeByClient() {
        Connection connection = DBConnection.Connect();
        // select all commande in database with client id and commande properties using foreign key
        try {
            Statement statement = connection.createStatement();
            String sql = "SELECT * FROM commande WHERE id_client = " + this.getClient().getId_client();
            statement.executeQuery(sql);
            System.out.println("All commande selected");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectCommandeByDate() {
        Connection connection = DBConnection.Connect();
        // select commande in database with client id and commande properties using foreign key
        try {
            Statement statement = connection.createStatement();
            String sql = "SELECT * FROM commande WHERE date = '" + this.getDate() + "'";
            statement.executeQuery(sql);
            System.out.println("Commande selected");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectAllCommandeByDate() {
        Connection connection = DBConnection.Connect();
        // select all commande in database with client id and commande properties using foreign key
        try {
            Statement statement = connection.createStatement();
            String sql = "SELECT * FROM commande WHERE date = '" + this.getDate() + "'";
            statement.executeQuery(sql);
            System.out.println("All commande selected");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ClientDAO client2 = new ClientDAO( "octopus", "eth1c", "50 rue souki belkhir", "23548050", "octopus@gmail.com");
        client2.insertClient();
        CommandeDAO commande2 = new CommandeDAO(client2, "2020-12-12", 100.0, "paypal", "payé", "dhl", "livré");
        commande2.insertCommande();
    }
}
