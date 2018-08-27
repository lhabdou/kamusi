package com.project.slh.kamusiyatafsiri.config;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseManager extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "Kamusi.db";
    private static final int DATABASE_VERSION = 1;


    public DatabaseManager(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        String sqlCreateRoles= "CREATE TABLE roles ("
                +" id integer PRIMARY KEY autoincrement,"
                +" nom_role text NOT NULL)";

        String sqlCreateStatus = "CREATE TABLE statuts("
                +" id_statut integer PRIMARY KEY autoincrement,"
                +" statut text not null); "
                +" CREATE INDEX statuts_id_statut_idx"
                +" ON statuts(id_statut);";

        String sqlCreateUtilisateurs = " CREATE TABLE utilisateurs " +
                "( " +
                "  id_utilisateur INTEGER PRIMARY KEY AUTOINCREMENT," +
                "  nom text NOT NULL," +
                "  prenom text NOT NULL," +
                "  pseudo text NOT NULL," +
                "  email text NOT NULL," +
                "  url_image text); " +
                "CREATE INDEX utilisateurs_id_utilisateur_idx" +
                "  ON utilisateurs(id_utilisateur);";

        String sqlCreateUtilisateurs_has_roles = "CREATE TABLE utilisateurs_has_roles " +
                "(" +
                "  id_utilisateur INTEGER PRIMARY KEY AUTOINCREMENT" +
                "  id_role integer NOT NULL );" +
                " CREATE INDEX utilisateur_has_role_fkindex1 " +
                "  ON utilisateurs_has_roles(id_utilisateur);" +
                " CREATE INDEX utilisateur_has_role_fkindex2 " +
                "  ON utilisateurs_has_roles(id_role);";
        String sqlCreateDictionnaire = " CREATE TABLE dictionnaire" +
                "(" +
                "  mot_fr text NOT NULL," +
                "  mot_com text NOT NULL DEFAULT shikomori," +
                "  id_utilisateur INTEGER NOT NULL," +
                "  id_statut INTEGER NOT NULL," +
                "  suggestion text," +
                "  definition_fr text," +
                "  definition_com text," +
                "  mot_ang text," +
                "  mot_ndz text," +
                "  mot_mwa text," +
                "  mot_mao text, " +
                "  PRIMARY KEY (mot_fr, mot_com), " +
                "  FOREIGN KEY (id_statut) REFERENCES statuts (id_statut)" +
                "  FOREIGN KEY (id_utilisateur) REFERENCES utilisateurs (id_utilisateur)" +
                "); " +
                " CREATE INDEX dictionnaire_fkindex1" +
                "  ON dictionnaire(id_utilisateur);" +
                " CREATE INDEX dictionnaire_user_fkindex2" +
                "  ON dictionnaire(id_utilisateur);" +
                " CREATE INDEX fki_dictionnaire_statut" +
                "  ON dictionnaire(id_statut);";
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
