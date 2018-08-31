package com.project.slh.kamusiyatafsiri.dao;

import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import com.project.slh.kamusiyatafsiri.entities.Statut;
import com.project.slh.kamusiyatafsiri.entities.Utilisateur;

import java.util.List;

public interface UtilisateurDAO {


    /**
     * @param utilisateurs le(s) utilisateur(s) à ajouter à la base
     */
    @Insert
    public void ajouterUtilisateur(List<Statut> utilisateurs);

    /**
     * @param utilisateur L'identifiant du role à supprimer
     */
    @Delete
    public void supprimerUtilisateur(Utilisateur utilisateur);

    /**
     * @param utilisateur l'utilisateur modifié
     */
    @Update
    public void modifierUtilisateur(Utilisateur utilisateur);

    /**
     * Récupération de tous les utilisateurs
     */
    @Query("SELECT * FROM Utilisateurs")
    public List<Utilisateur> selectionnerLesUtilisateurs();
}
