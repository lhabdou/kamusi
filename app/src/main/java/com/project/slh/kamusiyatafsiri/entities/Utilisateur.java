package com.project.slh.kamusiyatafsiri.entities;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity(tableName = "Utilisateurs")
public class Utilisateur {

    private @PrimaryKey(autoGenerate = true) Integer id_utilisateur;

    @ColumnInfo(name = "nom")
    private String nom;

    @ColumnInfo(name = "prenom")
    private String prenom;

    @ColumnInfo(name = "pseudo")
    private String pseudo;

    @ColumnInfo(name = "email")
    private String email;

    @ColumnInfo(name = "url_image")
    private String url_image;

    public Integer getId_utilisateur() {
        return id_utilisateur;
    }

    public void setId_utilisateur(Integer id_utilisateur) {
        this.id_utilisateur = id_utilisateur;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUrl_image() {
        return url_image;
    }

    public void setUrl_image(String url_image) {
        this.url_image = url_image;
    }

    @Override
    public String toString() {
        return "Utilisateur{" +
                "id_utilisateur=" + id_utilisateur +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", pseudo='" + pseudo + '\'' +
                ", email='" + email + '\'' +
                ", url_image='" + url_image + '\'' +
                '}';
    }
}
