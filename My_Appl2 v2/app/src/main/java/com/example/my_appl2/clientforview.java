package com.example.my_appl2;

public class clientforview {

    private  String nom;
    private String  phone;
    private String  gmail;
    private String  adress;

    public clientforview(String nom, String  phone,String  gmail,String  adress)
    {
        this.nom=nom;
        this.phone=phone;
        this.gmail=gmail;
        this.adress=adress;



    }

    public String getNom() {
        return nom;
    }

    public String getPhone() {
        return phone;
    }

    public String getGmail() {
        return gmail;
    }

    public String getAdress() {
        return adress;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
}
