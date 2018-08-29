package com.project.slh.kamusiyatafsiri.entities;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Embedded;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;

@Entity(tableName = "Dictionnaires", foreignKeys = {@ForeignKey(entity = Utilisateur.class, parentColumns = "cleDico", childColumns = "id_utilisateur"),
        @ForeignKey(entity = Statut.class, parentColumns = "cleDico", childColumns = "id_statut")})
public class LigneDictionnaire {

    @Embedded
    private CleDico cleDico;

    @ColumnInfo(name = "mot_ang")
    private String mot_ang;

    @ColumnInfo(name = "mot_ndz")
    private String mot_ndz;

    @ColumnInfo(name = "mot_mwa")
    private String mot_mwa;

    @ColumnInfo(name = "mot_mao")
    private String mot_mao;

    @ColumnInfo(name = "id_utilisateur")
    private Utilisateur utilisateur;

    @ColumnInfo(name = "id_statut")
    private Statut statut;

    public String getMot_ang() {
        return mot_ang;
    }

    public void setMot_ang(String mot_ang) {
        this.mot_ang = mot_ang;
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

    public CleDico getCleDico() {
        return cleDico;
    }

    public void setCleDico(CleDico cleDico) {
        this.cleDico = cleDico;
    }

    @Override
    public String toString() {
        return "LigneDictionnaire{" +
                "cleDico=" + cleDico +
                ", mot_ang='" + mot_ang + '\'' +
                ", mot_ndz='" + mot_ndz + '\'' +
                ", mot_mwa='" + mot_mwa + '\'' +
                ", mot_mao='" + mot_mao + '\'' +
                ", utilisateur=" + utilisateur +
                ", statut=" + statut +
                '}';
    }
}
