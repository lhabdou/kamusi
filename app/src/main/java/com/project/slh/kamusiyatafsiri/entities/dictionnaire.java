package com.project.slh.kamusiyatafsiri.entities;

public class dictionnaire {

    private String mot_fr;

    private String mot_ang;

    private String mot_com;

    private String mot_ndz;

    private String mot_mwa;

    private String mot_mao;


    private Utilisateur utilisateur;

    private Statut statut;

    public String getMot_fr() {
        return mot_fr;
    }

    public void setMot_fr(String mot_fr) {
        this.mot_fr = mot_fr;
    }

    public String getMot_ang() {
        return mot_ang;
    }

    public void setMot_ang(String mot_ang) {
        this.mot_ang = mot_ang;
    }

    public String getMot_com() {
        return mot_com;
    }

    public void setMot_com(String mot_com) {
        this.mot_com = mot_com;
    }

    public String getMot_ndz() {
        return mot_ndz;
    }

    public void setMot_ndz(String mot_ndz) {
        this.mot_ndz = mot_ndz;
    }

    public String getMot_mwa() {
        return mot_mwa;
    }

    public void setMot_mwa(String mot_mwa) {
        this.mot_mwa = mot_mwa;
    }

    public String getMot_mao() {
        return mot_mao;
    }

    public void setMot_mao(String mot_mao) {
        this.mot_mao = mot_mao;
    }

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

    public Statut getStatut() {
        return statut;
    }

    public void setStatut(Statut statut) {
        this.statut = statut;
    }

    @Override
    public String toString() {
        return "dictionnaire{" +
                "mot_fr='" + mot_fr + '\'' +
                ", mot_ang='" + mot_ang + '\'' +
                ", mot_com='" + mot_com + '\'' +
                ", mot_ndz='" + mot_ndz + '\'' +
                ", mot_mwa='" + mot_mwa + '\'' +
                ", mot_mao='" + mot_mao + '\'' +
                ", utilisateur=" + utilisateur +
                ", statut=" + statut +
                '}';
    }
}
