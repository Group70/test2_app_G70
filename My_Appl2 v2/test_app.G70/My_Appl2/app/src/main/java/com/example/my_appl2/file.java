package com.example.my_appl2;

public class file {

    private String date_creation;
    private String date_expidetion;
    private String personne;
    private String article;

    public file(String date_creation, String date_expidetion, String personne, String article) {
        this.date_creation = date_creation;
        this.date_expidetion = date_expidetion;
        this.personne = personne;
        this.article = article;
    }

    public String getDate_creation() {
        return date_creation;
    }

    public String getDate_expidetion() {
        return date_expidetion;
    }

    public String getPersonne() {
        return personne;
    }

    public String getArticle() {
        return article;
    }

    public void setDate_creation(String date_creation) {
        this.date_creation = date_creation;
    }

    public void setDate_expidetion(String date_expidetion) {
        this.date_expidetion = date_expidetion;
    }

    public void setPersonne(String personne) {
        this.personne = personne;
    }

    public void setArticle(String article) {
        this.article = article;
    }
}
