package com.project.slh.kamusiyatafsiri.entities;

import android.arch.persistence.room.ColumnInfo;

public class CleDico {

    @ColumnInfo(name = "mot_fr")
    private String mot_fr;

    @ColumnInfo(name = "mot_com")
    private String mot_com;

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

    @Override
    public String toString() {
        return "CleDico{" +
                "mot_fr='" + mot_fr + '\'' +
                ", mot_com='" + mot_com + '\'' +
                '}';
    }
}
