package com.sdzee.tp.beans;

public class Client {
    /* Propriétés du bean */

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
}
