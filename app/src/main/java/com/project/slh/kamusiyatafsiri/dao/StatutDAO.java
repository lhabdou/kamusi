package com.project.slh.kamusiyatafsiri.dao;

import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import com.project.slh.kamusiyatafsiri.entities.Role;
import com.project.slh.kamusiyatafsiri.entities.Statut;

import java.util.List;

public interface StatutDAO {

    /**
     * @param statuts le(s) statut(s) à ajouter à la base
     */
    @Insert
    public void ajouterStatut(List<Statut> statuts);

    /**
     * @param statut L'identifiant du role à supprimer
     */
    @Delete
    public void supprimerStatut(Statut statut);

    /**
     * @param statut le statut modifié
     */
    @Update
    public void modifierStatut(Statut statut);

    /**
     * Récupération de tous les statuts
     */
    @Query("SELECT * FROM Statuts")
    public List<Statut> selectionnerLesStatuts();
}
