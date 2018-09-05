package com.project.slh.kamusiyatafsiri.dao;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import com.project.slh.kamusiyatafsiri.entities.Role;

import java.util.List;

@Dao
public interface RoleDAO {

    /**
     * @param role un role à ajouter à la base
     */
    @Insert
    public void ajouterRole(Role role);

    /**
     * @param roles les roles à ajouter à la base
     */
    @Insert
    public void ajouterRole(List<Role> roles);

    /**
     * @param role L'identifiant du role à supprimer
     */
    @Delete
    public void supprimerRole(Role role);

    /**
     * @param role le role modifié
     */
    @Update
    public void modifierRole(Role role);

    /**
     * Récupération de tous les rôles
     */
    @Query("SELECT * FROM Roles")
    public LiveData<List<Role>> selectionnerLesRoles();


}
