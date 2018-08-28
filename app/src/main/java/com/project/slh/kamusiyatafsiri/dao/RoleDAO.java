package com.project.slh.kamusiyatafsiri.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.project.slh.kamusiyatafsiri.config.DAOBase;
import com.project.slh.kamusiyatafsiri.entities.Role;

import java.util.ArrayList;
import java.util.List;

@Dao
public interface RoleDAO {

    /**
     * @param roles le(s) role(s) à ajouter à la base
     */
    @Insert
    public void ajouterRole(List <Role> roles);

    /**
     * @param role L'identifiant du role à supprimer
     */
    @Delete
    public void supprimer(Role role);

    /**
     * @param role le role modifié
     */
    @Update
    public void modifierRole(Role role);

    /**
     * Récupération de toutes les rôles
     */
    @Query("SELECT * FROM Roles")
    public List<Role> selectionnerLesRoles();



}
