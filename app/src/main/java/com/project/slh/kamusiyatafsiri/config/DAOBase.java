package com.project.slh.kamusiyatafsiri.config;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import com.project.slh.kamusiyatafsiri.dao.DictionnaireDAO;
import com.project.slh.kamusiyatafsiri.dao.RoleDAO;
import com.project.slh.kamusiyatafsiri.dao.StatutDAO;
import com.project.slh.kamusiyatafsiri.dao.UtilisateurDAO;
import com.project.slh.kamusiyatafsiri.entities.LigneDictionnaire;
import com.project.slh.kamusiyatafsiri.entities.Role;
import com.project.slh.kamusiyatafsiri.entities.Statut;
import com.project.slh.kamusiyatafsiri.entities.Utilisateur;

@Database(entities = {LigneDictionnaire.class, Utilisateur.class, Statut.class, Role.class}, version = 1)
public abstract class DAOBase extends RoomDatabase{

    public abstract RoleDAO roleDAO();
    public abstract DictionnaireDAO dictionnaireDAO();
    public abstract StatutDAO statutDAO();
    public abstract UtilisateurDAO utilisateurDAO();

   // add to initialize database = Room.databaseBuilder(getApplicationContext(), DAOBase.class, DATABASE_NAME).build();

}
