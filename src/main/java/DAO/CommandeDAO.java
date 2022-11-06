package DAO;

import com.sdzee.tp.beans.Client;
import com.sdzee.tp.beans.Commande;

import java.sql.Connection;
import java.sql.Statement;

/*
* Make a CommandeDAO class extending the Commande class. It's going to be used to connect to the database using DBConnection class and make the CRUD operations.
* the commands are going to be made by the clients. So, the Client attribute is going to identify the client who made the order (commande).
*
* */

public class CommandeDAO extends Commande {

    public CommandeDAO() {
    }

    public CommandeDAO(int id_commande, Client client, String date_commande, Double montant, String mode_paiement, String statut_paiement, String mode_livraison, String statut_livraison) {
        super(id_commande, client, date_commande, montant, mode_paiement, statut_paiement, mode_livraison, statut_livraison);
    }

    public void addCommande(Commande commande) {
        try {
            Connection connection = DBConnection.Connect();
            Statement statement = connection.createStatement();
            String sql = "INSERT INTO commande (id_client, date_commande, montant_commande, mode_paiement, statut_paiement, mode_livraison, statut_livraison) VALUES ('" + commande.getClient().getId_client() + "', '" + commande.getDate_commande() + "', '" + commande.getMontant_commande() + "', '" + commande.getMode_paiement() + "', '" + commande.getStatut_paiement() + "', '" + commande.getMode_livraison() + "', '" + commande.getStatut_livraison() + "')";
            statement.executeUpdate(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteCommande(Commande commande) {
        try {
            Connection connection = DBConnection.Connect();
            Statement statement = connection.createStatement();
            String sql = "DELETE FROM commande WHERE id_commande = " + commande.getId_commande();
            statement.executeUpdate(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateCommande(Commande commande) {
        try {
            Connection connection = DBConnection.Connect();
            Statement statement = connection.createStatement();
            String sql = "UPDATE commande SET id_client = '" + commande.getClient().getId_client() + "', date_commande = '" + commande.getDate_commande() + "', montant_commande = '" + commande.getMontant_commande() + "', mode_paiement = '" + commande.getMode_paiement() + "', statut_paiement = '" + commande.getStatut_paiement() + "', mode_livraison = '" + commande.getMode_livraison() + "', statut_livraison = '" + commande.getStatut_livraison() + "' WHERE id_commande = " + commande.getId_commande();
            statement.executeUpdate(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void getCommande(Commande commande) {
        try {
            Connection connection = DBConnection.Connect();
            Statement statement = connection.createStatement();
            String sql = "SELECT * FROM commande WHERE id_commande = " + commande.getId_commande();
            statement.executeQuery(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* test the class */

    public static void main(String[] args) {
        CommandeDAO commandeDAO = new CommandeDAO();
        /* add a new client */

        Client client = new Client();
        client.setId_client(1);
        Commande commande = new Commande(client, "2020-01-01", 100.0, "paypal", "paid", "ups", "delivered");
        commandeDAO.addCommande(commande);

        /* select a client */
        commande.setId_commande(1);
        commandeDAO.getCommande(commande);
        System.out.println(commande);
    }
}

/*
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
            String sql = "INSERT INTO commande (id_client, date_commande, montant_commande, mode_paiement, statut_Paiement, mode_Livraison, statut_Livraison) VALUES (" + this.getClient().getId_client() + ", '" + this.getDate() + "', " + this.getMontant() + ", '" + this.getModePaiement() + "', '" + this.getStatutPaiement() + "', '" + this.getModeLivraison() + "', '" + this.getStatutLivraison() + "')";
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
            String sql = "UPDATE commande SET date_commande = '" + this.getDate() + "', montant_commande = " + this.getMontant() + ", mode_paiement = '" + this.getModePaiement() + "', statut_Paiement = '" + this.getStatutPaiement() + "', mode_Livraison = '" + this.getModeLivraison() + "', statut_Livraison = '" + this.getStatutLivraison() + "' WHERE id_commande = " + this.getId_commande();
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
            String sql = "SELECT * FROM commande WHERE date_commande = '" + this.getDate() + "'";
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
            String sql = "SELECT * FROM commande WHERE date_commande = '" + this.getDate() + "'";
            statement.executeQuery(sql);
            System.out.println("All commande selected");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

    }
}
*/