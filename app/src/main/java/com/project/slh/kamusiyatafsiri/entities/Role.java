package com.project.slh.kamusiyatafsiri.entities;
import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;

@Entity(tableName = "Roles")
public class Role {


    private @PrimaryKey(autoGenerate = true) Integer id;

    @ColumnInfo(name = "nom_role")
    private String nom_role;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNom_role() {
        return nom_role;
    }

    public void setNom_role(String nom_role) {
        this.nom_role = nom_role;
    }
}
