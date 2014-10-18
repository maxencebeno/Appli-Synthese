/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package metier;

import java.util.Date;
import java.util.*;
import java.io.*;
import java.sql.*;
import parametre.Connexion;

/**
 *
 * @author Vincent
 */
public class VIP {
    // Attributs de VIP
    protected int id;
    protected String nom;
    protected String prenomUsage;
    protected String prenoms;
    protected String sexe;
    protected String civilité;
    protected int age;
    protected String statut;
    protected String lieuNaissance;
    protected String dateNaissance;
    protected int enfants;
    protected String nationalite;
    protected String pathImage;
    
    private static int dernierNumeroAttribue = 31;
    
    // Constructeurs
    public VIP(String nom, String prenomUsage, String prenoms, String sexe, String civilite, int age, String statut, String lieuNaissance, String dateNaissance, int enfants, String nationalite) {
        id = ++dernierNumeroAttribue;
        this.nom = nom;
        this.prenomUsage = prenomUsage;
        this.prenoms = prenoms;
        this.sexe = sexe;
        this.civilité = civilite;
        this.age = age;
        this.statut = statut;
        this.lieuNaissance = lieuNaissance;
        this.dateNaissance = dateNaissance;
        this.enfants = enfants;
        this.nationalite = nationalite;
    }
    
    
    public VIP(){
        
    }
    
    // Getters
    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenomUsage() {
        return prenomUsage;
    }

    public String getPrenoms() {
        return prenoms;
    }

    public String getSexe() {
        return sexe;
    }

    public int getAge() {
        return age;
    }

    public String getStatut() {
        return statut;
    }

    public String getLieuNaissance() {
        return lieuNaissance;
    }

    public String getDateNaissance() {
        return dateNaissance;
    }

    public String getCivilité() {
        return civilité;
    }
    
    public int getEnfants() {
        return enfants;
    }

    public String getNationalite() {
        return nationalite;
    }

    public String getPathImage() {
        return pathImage;
    }
    
    
    
    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenomUsage(String prenomUsage) {
        this.prenomUsage = prenomUsage;
    }

    public void setPrenoms(String prenoms) {
        this.prenoms = prenoms;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public void setLieuNaissance(String lieuNaissance) {
        this.lieuNaissance = lieuNaissance;
    }

    public void setDateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public void setEnfants(int enfants) {
        this.enfants = enfants;
    }

    public void setCivilité(String civilité) {
        this.civilité = civilité;
    }

    public void setNationalite(String nationalite) {
        this.nationalite = nationalite;
    }

    public void setPathImage(String pathImage) {
        this.pathImage = pathImage;
    }
}
