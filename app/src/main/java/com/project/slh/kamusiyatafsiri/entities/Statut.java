package com.project.slh.kamusiyatafsiri.entities;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity(tableName = "Statuts")
public class Statut {

    private @PrimaryKey(autoGenerate = true) Integer id_statut;

    private String statut;

    public Integer getId_statut() {
        return id_statut;
    }

    public void setId_statut(Integer id_statut) {
        this.id_statut = id_statut;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    @Override
    public String toString() {
        return "Statut{" +
                "id_statut=" + id_statut +
                ", statut='" + statut + '\'' +
                '}';
    }
}
