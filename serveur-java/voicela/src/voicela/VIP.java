/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package voicela;

import java.util.Date;
import java.util.*;
import java.io.*;

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
    protected int age;
    protected String statut;
    protected String lieuNaissance;
    protected Date dateNaissance;
    protected int enfants;
    
    // Constructeurs
    public VIP(String nom, String prenomUsage, String prenoms, String sexe, int age, String statut, Date dateNaissance, int enfants) {
        this.nom = nom;
        this.prenomUsage = prenomUsage;
        this.prenoms = prenoms;
        this.sexe = sexe;
        this.age = age;
        this.statut = statut;
        this.dateNaissance = dateNaissance;
        this.enfants = enfants;
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

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public int getEnfants() {
        return enfants;
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

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public void setEnfants(int enfants) {
        this.enfants = enfants;
    }
     
    // Méthodes
    public void seMarier(VIP vip1, VIP vip2){
        
        Mariage mariage = new Mariage();
    }
    
    public void divorcer(VIP vip){
        
    }
}
