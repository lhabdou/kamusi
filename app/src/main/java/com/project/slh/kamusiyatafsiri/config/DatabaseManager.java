package com.project.slh.kamusiyatafsiri.config;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DatabaseManager extends SQLiteOpenHelper {


    public DatabaseManager(Context context, SQLiteDatabase.CursorFactory factory, String DATABASE_NAME, int DATABASE_VERSION) {
        super(context, DATABASE_NAME, factory, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        String sqlCreateRoles= "CREATE TABLE IF NOT EXISTS roles ("
                +" id integer PRIMARY KEY autoincrement,"
                +" nom_role text NOT NULL)";

        String sqlCreateStatuts = "CREATE TABLE IF NOT EXISTS statuts("
                +" id_statut integer PRIMARY KEY autoincrement,"
                +" statut text not null); ";

        String sqlCreateUtilisateurs = " CREATE TABLE IF NOT EXISTS utilisateurs " +
                "( " +
                "  id_utilisateur INTEGER PRIMARY KEY AUTOINCREMENT," +
                "  nom text NOT NULL," +
                "  prenom text NOT NULL," +
                "  pseudo text NOT NULL," +
                "  email text NOT NULL," +
                "  url_image text); ";



        String sqlCreateUtilisateurs_has_roles = "CREATE TABLE IF NOT EXISTS utilisateurs_has_roles " +
                "(" +
                "  id_utilisateur INTEGER PRIMARY KEY AUTOINCREMENT," +
                "  id_role integer NOT NULL )";

        String sqlCreateDictionnaire = " CREATE TABLE IF NOT EXISTS dictionnaire" +
                "(" +
                "  mot_fr text NOT NULL," +
                "  mot_com text NOT NULL DEFAULT 'shikomori'," +
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
                "  FOREIGN KEY (id_statut) REFERENCES statuts (id_statut)," +
                "  FOREIGN KEY (id_utilisateur) REFERENCES utilisateurs (id_utilisateur))";

        String index1 = "CREATE UNIQUE INDEX IF NOT EXISTS statuts_id_statut_idx" +
                " ON statuts(id_statut)";
        String index2 = " CREATE UNIQUE INDEX IF NOT EXISTS utilisateurs_id_utilisateur_idx" +
                " ON utilisateurs(id_utilisateur)";
        String index3 = " CREATE UNIQUE INDEX IF NOT EXISTS utilisateur_has_role_fkindex1 " +
                " ON utilisateurs_has_roles(id_utilisateur)";
        String index4 = " CREATE UNIQUE INDEX IF NOT EXISTS utilisateur_has_role_fkindex2 " +
                " ON utilisateurs_has_roles(id_role)";
        String index5 = "CREATE UNIQUE INDEX IF NOT EXISTS dictionnaire_fkindex1" +
                " ON dictionnaire(id_utilisateur)";
        String index6 = "CREATE UNIQUE INDEX IF NOT EXISTS dictionnaire_user_fkindex2" +
                " ON dictionnaire(id_utilisateur)";
        String index7 = "CREATE UNIQUE INDEX IF NOT EXISTS fki_dictionnaire_statut" +
                " ON dictionnaire(id_statut)";

        sqLiteDatabase.execSQL(sqlCreateRoles);
        sqLiteDatabase.execSQL(sqlCreateStatuts);
        sqLiteDatabase.execSQL(sqlCreateUtilisateurs);
        sqLiteDatabase.execSQL(sqlCreateUtilisateurs_has_roles);
        sqLiteDatabase.execSQL(sqlCreateDictionnaire);
        sqLiteDatabase.execSQL(index1);  sqLiteDatabase.execSQL(index2);  sqLiteDatabase.execSQL(index3);
        sqLiteDatabase.execSQL(index4);  sqLiteDatabase.execSQL(index5);  sqLiteDatabase.execSQL(index6);
        sqLiteDatabase.execSQL(index7);

        Log.i("DATABASE", "onCreate invoked");

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

        String strSqlDeleteDictionnaire = "drop table if exists dictionnaire";
        String sqlDeleteUtilisateurs_has_roles = "drop table if exists utilisateurs_has_roles";
        String sqlDeleteRoles = "drop table if exists roles";
        String sqlDeleteStatuts = "drop table if exists statuts";
        String sqlCreateUtilisateurs = "drop table if exists utilisateurs";

        sqLiteDatabase.execSQL( strSqlDeleteDictionnaire);
        sqLiteDatabase.execSQL(sqlDeleteUtilisateurs_has_roles);
        sqLiteDatabase.execSQL(sqlDeleteRoles);
        sqLiteDatabase.execSQL(sqlDeleteStatuts);
        sqLiteDatabase.execSQL(sqlCreateUtilisateurs);

        this.onCreate(sqLiteDatabase);
        Log.i( "DATABASE", "onUpgrade invoked" );

    }


}
