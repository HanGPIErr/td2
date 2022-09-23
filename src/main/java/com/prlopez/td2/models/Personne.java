package com.prlopez.td2.models;

public class Personne {

    protected String nom;
    protected int age;

    protected boolean majeur;

    public Personne(String nom, int age) {
        this.nom = nom;
        this.setAge(age);
    }
public boolean isMajeur(){
        return majeur;
}
//    public void setMajeur(boolean majeur) {
//        this.majeur = majeur;
//    }

    public String getPersonne() {
        return nom;
    }

    public void setPersonne(String personne) {
        nom = personne;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        this.majeur = age >=18;
    }
}
