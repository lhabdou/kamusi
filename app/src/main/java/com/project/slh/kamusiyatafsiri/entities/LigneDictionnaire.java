package com.project.slh.kamusiyatafsiri.entities;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.Index;
import android.support.annotation.NonNull;

@Entity(primaryKeys = {"mot_fr","mot_com"},tableName = "Dictionnaires",
        foreignKeys = {@ForeignKey(entity = Utilisateur.class, parentColumns = "id_utilisateur", childColumns = "id_utilisateur"),
        @ForeignKey(entity = Statut.class, parentColumns = "id_statut", childColumns = "id_statut")},
indices = {@Index(value = "id_statut", unique = true), @Index(value = "id_utilisateur",unique = true)})
public class LigneDictionnaire {
    @NonNull
    private String mot_fr;
    @NonNull
    private String mot_com;

    @ColumnInfo(name = "mot_ang")
    private String mot_ang;

    @ColumnInfo(name = "mot_ndz")
    private String mot_ndz;

    @ColumnInfo(name = "mot_mwa")
    private String mot_mwa;

    @ColumnInfo(name = "mot_mao")
    private String mot_mao;

    @ColumnInfo(name = "id_utilisateur")
    private Integer id_utilisateur;

    @ColumnInfo(name = "id_statut")
    private Integer id_statut;

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


    public Integer getId_utilisateur() {
        return id_utilisateur;
    }

    public void setId_utilisateur(Integer id_utilisateur) {
        this.id_utilisateur = id_utilisateur;
    }

    public Integer getId_statut() {
        return id_statut;
    }

    public void setId_statut(Integer id_statut) {
        this.id_statut = id_statut;
    }

    public String getMot_fr() {
        return mot_fr;
    }

    public void setMot_fr(String mot_fr) {
        this.mot_fr = mot_fr;
    }

    public String getMot_com() {
        return mot_com;
    }

    public void setMot_com(String mot_com) {
        this.mot_com = mot_com;
    }
}
