package com.example.my_appl2;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.util.ArrayList;

public class my_database extends SQLiteOpenHelper {
    public my_database(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("CREATE TABLE Agent(id INTEGER PRIMARY KEY AUTOINCREMENT,nom TEXT,prenom TEXT)");
        db.execSQL("CREATE TABLE Client(id INTEGER PRIMARY KEY AUTOINCREMENT,nom TEXT,prenom TEXT,phone TEXT,gmail TEXT,adress TEXT)");
        db.execSQL("CREATE TABLE Fournisesur(id INTEGER PRIMARY KEY AUTOINCREMENT,nom TEXT,prenom TEXT,phone TEXT,gmail TEXT,adress TEXT)");
        db.execSQL("CREATE TABLE Facture(id INTEGER PRIMARY KEY AUTOINCREMENT,date_de_creation TEXT,date_dexpiration TEXT,personne_concerne TEXT,L_article TEXT)");
        db.execSQL("CREATE TABLE Devis(id INTEGER PRIMARY KEY AUTOINCREMENT,date_de_creation TEXT,date_dexpiration TEXT,client TEXT,L_article TEXT)");
        db.execSQL("CREATE TABLE Bon_de_commande(id INTEGER PRIMARY KEY AUTOINCREMENT,date_de_creation TEXT,fournisseur TEXT,echange_de_paiement TEXT,L_article TEXT)");


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {

        //db.execSQL("DROP TABLE IF EXISTS Agent");
        //db.execSQL("CREATE TABLE Client(id INTEGER PRIMARY KEY AUTOINCREMENT,nom TEXT,prenom TEXT,phone TEXT,gmail TEXT,adress TEXT)");
//        db.execSQL("CREATE TABLE if not exists Fournisesur(id INTEGER PRIMARY KEY AUTOINCREMENT,nom TEXT,prenom TEXT,phone TEXT,gmail TEXT,adress TEXT)");
//        db.execSQL("CREATE TABLE if not exists Facture(id INTEGER PRIMARY KEY AUTOINCREMENT,date_de_creation TEXT,date_dexpiration TEXT,personne_concerne TEXT,L_article TEXT)");
//        db.execSQL("CREATE TABLE if not exists Devis(id INTEGER PRIMARY KEY AUTOINCREMENT,date_de_creation TEXT,date_dexpiration TEXT,client TEXT,L_article TEXT)");
//        db.execSQL("CREATE TABLE if not exists Bon_de_commande(id INTEGER PRIMARY KEY AUTOINCREMENT,date_de_creation TEXT,fournisseur TEXT,echange_de_paiement TEXT,L_article TEXT)");


        onCreate(db);

    }
//***************************************************************************************
    //test
    public void Ajouter(String n,String p)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues cv=new ContentValues();
        cv.put("nom",n);
        cv.put("prenom",p);
        db.insert("Agent",null,cv);
        db.close();


    }

    @SuppressLint("Range")
    public ArrayList<String> get(){
            SQLiteDatabase db=this.getReadableDatabase();
            Cursor cur=db.rawQuery("SELECT * FROM Agent",null);
            ArrayList<String> all=new ArrayList<String>();
            cur.moveToFirst();
            while (cur.isAfterLast()==false)
            {
                int id;
                String nom,prenom;
                id=cur.getInt(cur.getColumnIndex("id"));
                nom=cur.getString(cur.getColumnIndex("nom"));
                prenom=cur.getString(cur.getColumnIndex("prenom"));

                all.add(" id= "+String.valueOf(id)+" nom= "+nom+" age = "+prenom);
                cur.moveToNext();


            }
                db.close();
            return all;

    }

            public void modifieragent(int id,String nn,String pp)
            {
                SQLiteDatabase db=this.getWritableDatabase();
                ContentValues cv=new ContentValues();
                cv.put("prenom",pp);
                cv.put("nom",nn);
                db.update("Agent",cv,"id=?",new String[]{String.valueOf(id)});
            }
         //*****gestion table client
        //----ajouter
        public void AjouterClient(String n,String p,String ph,String g,String a)
        {
            SQLiteDatabase db=this.getWritableDatabase();
            ContentValues cv=new ContentValues();
            cv.put("nom",n);
            cv.put("prenom",p);
            cv.put("phone",ph);
            cv.put("gmail",g);
            cv.put("adress",a);

             db.insert("Client",null,cv);
            db.close();

        }
        //----select
        @SuppressLint("Range")
        public ArrayList<clientforview> getclient(){
            SQLiteDatabase db=this.getReadableDatabase();
            Cursor cur=db.rawQuery("SELECT * FROM Client",null);
            ArrayList<clientforview> all=new ArrayList<>();
            cur.moveToFirst();
            while (cur.isAfterLast()==false)
            {
                int id;
                String nom,prenom,phone,gmail,adress;
                id=cur.getInt(cur.getColumnIndex("id"));
                nom=cur.getString(cur.getColumnIndex("nom"));
                prenom=cur.getString(cur.getColumnIndex("prenom"));
                phone=cur.getString(cur.getColumnIndex("phone"));
                gmail=cur.getString(cur.getColumnIndex("gmail"));
                adress=cur.getString(cur.getColumnIndex("adress"));

                all.add(new clientforview(nom+" "+prenom,phone,gmail,adress));
                cur.moveToNext();


            }
            db.close();
            return all;

        }

        //*******************************************************************************************************************
    //*****gestion table fournisseur
    //----ajouter
    public void AjouterFrournisseur(String n,String p,String ph,String g,String a)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues cv=new ContentValues();
        cv.put("nom",n);
        cv.put("prenom",p);
        cv.put("phone",ph);
        cv.put("gmail",g);
        cv.put("adress",a);

        db.insert("Fournisesur",null,cv);
        db.close();

    }
    //----select
    @SuppressLint("Range")
    public ArrayList<clientforview> getfournisseur(){
        SQLiteDatabase db=this.getReadableDatabase();
        Cursor cur=db.rawQuery("SELECT * FROM Fournisesur",null);
        ArrayList<clientforview> all=new ArrayList<>();
        cur.moveToFirst();
        while (cur.isAfterLast()==false)
        {
            int id;
            String nom,prenom,phone,gmail,adress;
            id=cur.getInt(cur.getColumnIndex("id"));
            nom=cur.getString(cur.getColumnIndex("nom"));
            prenom=cur.getString(cur.getColumnIndex("prenom"));
            phone=cur.getString(cur.getColumnIndex("phone"));
            gmail=cur.getString(cur.getColumnIndex("gmail"));
            adress=cur.getString(cur.getColumnIndex("adress"));

            all.add(new clientforview(nom+" "+prenom,phone,gmail,adress));
            cur.moveToNext();


        }
        db.close();
        return all;

    }
    //*******************************************************************************************************************
    //*****gestion table bon de commande
    //----ajouter
    public void AjouterBon_de_commande(String n,String p,String ph,String g)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues cv=new ContentValues();
        cv.put("date_de_creation",n);
        cv.put("fournisseur",p);
        cv.put("echange_de_paiement",ph);
        cv.put("L_article",g);


        db.insert("Bon_de_commande",null,cv);
        db.close();

    }
    //----select
    @SuppressLint("Range")
    public ArrayList<file> getBon_de_commande(){
        SQLiteDatabase db=this.getReadableDatabase();
        Cursor cur=db.rawQuery("SELECT * FROM Bon_de_commande",null);
        ArrayList<file> all=new ArrayList<>();
        cur.moveToFirst();
        while (cur.isAfterLast()==false)
        {
            int id;
            String v1,v2,v3,v4;
            id=cur.getInt(cur.getColumnIndex("id"));
            v1=cur.getString(cur.getColumnIndex("date_de_creation"));
            v2=cur.getString(cur.getColumnIndex("fournisseur"));
            v3=cur.getString(cur.getColumnIndex("echange_de_paiement"));
            v4=cur.getString(cur.getColumnIndex("L_article"));


            all.add(new file(v1,v2,v3,v4));
            cur.moveToNext();


        }
        db.close();
        return all;

    }

    //*******************************************************************************************************************
    //*****gestion table facture
    //----ajouter
    public void AjouterFacture(String n,String p,String ph,String g)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues cv=new ContentValues();
        cv.put("date_de_creation",n);
        cv.put("date_dexpiration",p);
        cv.put("personne_concerne",ph);
        cv.put("L_article",g);


        db.insert("Facture",null,cv);
        db.close();

    }
    //----select
    @SuppressLint("Range")
    public ArrayList<file> getFacture(){
        SQLiteDatabase db=this.getReadableDatabase();
        Cursor cur=db.rawQuery("SELECT * FROM Facture",null);
        ArrayList<file> all=new ArrayList<>();
        cur.moveToFirst();
        while (cur.isAfterLast()==false)
        {
            int id;
            String v1,v2,v3,v4;
            id=cur.getInt(cur.getColumnIndex("id"));
            v1=cur.getString(cur.getColumnIndex("date_de_creation"));
            v2=cur.getString(cur.getColumnIndex("date_dexpiration"));
            v3=cur.getString(cur.getColumnIndex("personne_concerne"));
            v4=cur.getString(cur.getColumnIndex("L_article"));


            all.add(new file(v1,v2,v3,v4));
            cur.moveToNext();


        }
        db.close();
        return all;

    }

    //*******************************************************************************************************************
    //*****gestion table devis
    //----ajouter
    public void AjouterDevis(String n,String p,String ph,String g)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues cv=new ContentValues();
        cv.put("date_de_creation",n);
        cv.put("date_dexpiration",p);
        cv.put("client",ph);
        cv.put("L_article",g);


        db.insert("Devis",null,cv);
        db.close();

    }
    //----select
    @SuppressLint("Range")
    public ArrayList<file> getDevis(){
        SQLiteDatabase db=this.getReadableDatabase();
        Cursor cur=db.rawQuery("SELECT * FROM Devis",null);
        ArrayList<file> all=new ArrayList<>();
        cur.moveToFirst();
        while (cur.isAfterLast()==false)
        {
            int id;
            String v1,v2,v3,v4;
            id=cur.getInt(cur.getColumnIndex("id"));
            v1=cur.getString(cur.getColumnIndex("date_de_creation"));
            v2=cur.getString(cur.getColumnIndex("date_dexpiration"));
            v3=cur.getString(cur.getColumnIndex("client"));
            v4=cur.getString(cur.getColumnIndex("L_article"));


            all.add(new file(v1,v2,v3,v4));
            cur.moveToNext();


        }
        db.close();
        return all;

    }

}
