package com.project.slh.kamusiyatafsiri.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import com.project.slh.kamusiyatafsiri.entities.LigneDictionnaire;
import com.project.slh.kamusiyatafsiri.entities.Role;

import java.util.List;

@Dao
public interface DictionnaireDAO {

    /**
     * @param lignesDictionnaires  role(s) à ajouter à la base
     */
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    public void ajouterDesMots(List<LigneDictionnaire> lignesDictionnaires);

    /**
     * @param ligneDictionnaire L'identifiant de la ligne à supprimer
     */
    @Delete
    public void supprimerLigneDictionnaire(LigneDictionnaire ligneDictionnaire);

    /**
     * @param ligneDictionnaire la ligne modifiée
     */
    @Update
    public void modifierLigneDictionnaire(LigneDictionnaire ligneDictionnaire);

    /**
     * Récupération des mots à l'aide d'un mot clé
     */
    @Query("SELECT * FROM Dictionnaires d WHERE d.mot_fr LIKE :motCleFr")
    public List<LigneDictionnaire> selectionnerLesMotsFr(String motCleFr);

    @Query("SELECT * FROM Dictionnaires d WHERE d.mot_com LIKE :motCleCom")
    public List<LigneDictionnaire> selectionnerLesMotsCom(String motCleCom);

    @Query("SELECT * FROM Dictionnaires d WHERE d.mot_ang LIKE :motCleAng")
    public List<LigneDictionnaire> selectionnerLesMotsAng(String motCleAng);

    @Query("SELECT * FROM Dictionnaires d WHERE d.mot_ndz LIKE :motCleNdz")
    public List<LigneDictionnaire> selectionnerLesMotsNdz(String motCleNdz);

    @Query("SELECT * FROM Dictionnaires d WHERE d.mot_mwa LIKE :motCleMwa")
    public List<LigneDictionnaire> selectionnerLesMotsMwa(String motCleMwa);

    @Query("SELECT * FROM Dictionnaires d WHERE d.mot_mao LIKE :motCleMao")
    public List<LigneDictionnaire> selectionnerLesMotsMao(String motCleMao);
}
