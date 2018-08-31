package com.project.slh.kamusiyatafsiri.entities;

import android.arch.persistence.room.ColumnInfo;

import io.reactivex.annotations.NonNull;

public class CleDico {

    private String mot_fr;

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
}
