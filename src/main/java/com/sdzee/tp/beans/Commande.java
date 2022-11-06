package com.sdzee.tp.beans;

/*
* Make a Commande class with the following attributes:
* id_commande, client (from Client class), date_commande, montant, mode_paiement, statut_paiement, mode_livraison, statut_livraison.
*
* the Client attribute is going to identify the client who made the order (commande).
*
* */

public class Commande {
    private int id_commande;
    private Client client;
    private String date_commande;
    private Double montant_commande;
    private String mode_paiement;
    private String statut_paiement;
    private String mode_livraison;
    private String statut_livraison;

    public Commande() {
    }

    public Commande(int id_commande, Client client, String date_commande, Double montant, String mode_paiement, String statut_paiement, String mode_livraison, String statut_livraison) {
        this.id_commande = id_commande;
        this.client = client;
        this.date_commande = date_commande;
        this.montant_commande = montant;
        this.mode_paiement = mode_paiement;
        this.statut_paiement = statut_paiement;
        this.mode_livraison = mode_livraison;
        this.statut_livraison = statut_livraison;
    }

    public Commande(Client client, String s, double v, String paypal, String paid, String ups, String delivered) {
    }

    public int getId_commande() {
        return id_commande;
    }

    public void setId_commande(int id_commande) {
        this.id_commande = id_commande;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getDate_commande() {
        return date_commande;
    }

    public void setDate_commande(String date_commande) {
        this.date_commande = date_commande;
    }

    public Double getMontant_commande() {
        return montant_commande;
    }

    public void setMontant_commande(Double montant_commande) {
        this.montant_commande = montant_commande;
    }

    public String getMode_paiement() {
        return mode_paiement;
    }

    public void setMode_paiement(String mode_paiement) {
        this.mode_paiement = mode_paiement;
    }

    public String getStatut_paiement() {
        return statut_paiement;
    }

    public void setStatut_paiement(String statut_paiement) {
        this.statut_paiement = statut_paiement;
    }

    public String getMode_livraison() {
        return mode_livraison;
    }

    public void setMode_livraison(String mode_livraison) {
        this.mode_livraison = mode_livraison;
    }

    public String getStatut_livraison() {
        return statut_livraison;
    }

    public void setStatut_livraison(String statut_livraison) {
        this.statut_livraison = statut_livraison;
    }

}

/*
public class Commande {
    /* Propriétés du bean

    private int id_commande;
    private Client client;
    private String date;
    private Double montant;
    private String modePaiement;
    private String statutPaiement;
    private String modeLivraison;
    private String statutLivraison;

    public int getId_commande() { return id_commande; }
    public void setId_commande(int id_commande) { this.id_commande = id_commande; }
    public Client getClient() {
        return client;
    }
    public void setClient( Client client ) {
        this.client = client;
    }
    public String getDate() {
        return date;
    }
    public void setDate( String date ) {
        this.date = date;
    }
    public Double getMontant() {
        return montant;
    }
    public void setMontant( Double montant ) {
        this.montant = montant;
    }
    public String getModePaiement() {
        return modePaiement;
    }
    public void setModePaiement( String modePaiement ) {
        this.modePaiement = modePaiement;
    }
    public String getStatutPaiement() {
        return statutPaiement;
    }
    public void setStatutPaiement( String statutPaiement ) {
        this.statutPaiement = statutPaiement;
    }
    public String getModeLivraison() {
        return modeLivraison;
    }
    public void setModeLivraison( String modeLivraison ) {
        this.modeLivraison = modeLivraison;
    }
    public String getStatutLivraison() {
        return statutLivraison;
    }
    public void setStatutLivraison( String statutLivraison ) {
        this.statutLivraison = statutLivraison;
    }
}*/

