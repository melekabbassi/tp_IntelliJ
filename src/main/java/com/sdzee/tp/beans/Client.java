package com.sdzee.tp.beans;

/*
* Make a Client class that has the following attributes: id_client, nom, prenom, adresse, telephone, email.
*
* id_client is the primary key and is auto-incremented, it's going to be used in the database to identify each client and his commande.
*
* */

public class Client {
    private int id_client;
    private String nom;
    private String prenom;
    private String adresse;
    private String telephone;
    private String email;

    public Client() {
    }

    public Client(int id_client, String nom, String prenom, String adresse, String telephone, String email) {
        this.id_client = id_client;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.telephone = telephone;
        this.email = email;
    }

    public int getId_client() {
        return id_client;
    }

    public void setId_client(int id_client) {
        this.id_client = id_client;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom(){
        return prenom;
    }

    public void setPrenom(String prenom){
        this.prenom = prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

/*
public class Client {
    /* Propriétés du bean

    private int id_client;
    private String nom;
    private String prenom;
    private String adresse;
    private String telephone;
    private String email;

    public int getId_client() {
        return id_client;
    }
    public void setId_client(int id_client) {
        this.id_client = id_client;
    }
    public void setNom( String nom ) {
        this.nom = nom;
    }
    public String getNom() {
        return nom;
    }
    public void setPrenom( String prenom ) {
        this.prenom = prenom;
    }
    public String getPrenom() {
        return prenom;
    }
    public void setAdresse( String adresse ) {
        this.adresse = adresse;
    }
    public String getAdresse() {
        return adresse;
    }
    public String getTelephone() {
        return telephone;
    }
    public void setTelephone( String telephone ) {
        this.telephone = telephone;
    }
    public void setEmail( String email ) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }
}*/